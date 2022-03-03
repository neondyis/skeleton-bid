package org.vanderlande.models;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BatchTaskStationId implements Serializable {
    private static final long serialVersionUID = -8119920785558652420L;
    @Column(name = "STN_ID", nullable = false)
    private Long stnId;
    @Column(name = "BTK_ID", nullable = false)
    private Long btkId;

    public Long getBtkId() {
        return btkId;
    }

    public void setBtkId(Long btkId) {
        this.btkId = btkId;
    }

    public Long getStnId() {
        return stnId;
    }

    public void setStnId(Long stnId) {
        this.stnId = stnId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stnId, btkId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BatchTaskStationId entity = (BatchTaskStationId) o;
        return Objects.equals(this.stnId, entity.stnId) &&
                Objects.equals(this.btkId, entity.btkId);
    }
}