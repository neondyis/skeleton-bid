package org.vanderlande.services.graphqi.Filters;

import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

@Data
public class FilterField {

    private String operator;
    private String value;

    public Predicate generateCriteria(CriteriaBuilder builder, Path field) {
        if (isNumeric(value)) {
            int v = Integer.parseInt(value);
            switch (operator) {
                case "<":
                    return builder.lt(field, v);
                case "<=":
                    return builder.le(field, v);
                case ">":
                    return builder.gt(field, v);
                case ">=":
                    return builder.ge(field, v);
                case "=":
                    return builder.equal(field, v);
            }
        } else {
            switch (operator) {
                case "endsWith":
                    return builder.like(field, "%" + value);
                case "startsWith":
                    return builder.like(field, value + "%");
                case "contains":
                    return builder.like(field, "%" + value + "%");
                case "eq":
                    return builder.equal(field, value);
            }
        }
        return null;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
