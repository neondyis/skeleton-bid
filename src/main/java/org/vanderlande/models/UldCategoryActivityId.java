package org.vanderlande.models;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UldCategoryActivityId implements Serializable {
    private static final long serialVersionUID = -4267315186145987365L;
    @Column(name = "ULC_ID", nullable = false)
    private Long ulcId;
    @Column(name = "ACY_ID", nullable = false)
    private Long acyId;

    public Long getAcyId() {
        return acyId;
    }

    public void setAcyId(Long acyId) {
        this.acyId = acyId;
    }

    public Long getUlcId() {
        return ulcId;
    }

    public void setUlcId(Long ulcId) {
        this.ulcId = ulcId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ulcId, acyId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UldCategoryActivityId entity = (UldCategoryActivityId) o;
        return Objects.equals(this.ulcId, entity.ulcId) &&
                Objects.equals(this.acyId, entity.acyId);
    }
}