package org.vanderlande.models;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StationBidMessageId implements Serializable {
    private static final long serialVersionUID = 6485327362428603068L;
    @Column(name = "STN_ID", nullable = false)
    private Long stnId;
    @Column(name = "BIM_ID", nullable = false)
    private Long bimId;

    public Long getBimId() {
        return bimId;
    }

    public void setBimId(Long bimId) {
        this.bimId = bimId;
    }

    public Long getStnId() {
        return stnId;
    }

    public void setStnId(Long stnId) {
        this.stnId = stnId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stnId, bimId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        StationBidMessageId entity = (StationBidMessageId) o;
        return Objects.equals(this.stnId, entity.stnId) &&
                Objects.equals(this.bimId, entity.bimId);
    }
}