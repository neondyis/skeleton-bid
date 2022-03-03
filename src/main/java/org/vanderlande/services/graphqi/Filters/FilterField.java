package org.vanderlande.services.graphqi.Filters;

import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Data
public class FilterField {

    private String operator;
    private String value;

    public Predicate generateCriteria(Root<Object> root, CriteriaBuilder builder, Path field) {
//        Predicate p = builder.conjunction();
        try {
            int v = Integer.parseInt(value);
            switch (operator) {
                case "<": return builder.lt(field, v);
                case "<=": return builder.le(field, v);
                case ">": return builder.gt(field, v);
                case ">=": return builder.ge(field, v);
                case "=": return builder.equal(field, v);
            }
        } catch (NumberFormatException e) {
            switch (operator) {
                case "endsWith": return builder.like(field, "%" + value);
                case "startsWith": return builder.like(field, value + "%");
                case "contains": return builder.like(field, "%" + value + "%");
                case "eq": return builder.equal(field, value);
            }
        }

        return null;
    }
}
