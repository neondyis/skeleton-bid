package org.vanderlande.models;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DisplayBidMessageId implements Serializable {
    private static final long serialVersionUID = -3346762576745035522L;
    @Column(name = "DCS_ID", nullable = false)
    private Long dcsId;
    @Column(name = "BIM_ID", nullable = false)
    private Long bimId;

    public Long getBimId() {
        return bimId;
    }

    public void setBimId(Long bimId) {
        this.bimId = bimId;
    }

    public Long getDcsId() {
        return dcsId;
    }

    public void setDcsId(Long dcsId) {
        this.dcsId = dcsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dcsId, bimId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DisplayBidMessageId entity = (DisplayBidMessageId) o;
        return Objects.equals(this.dcsId, entity.dcsId) &&
                Objects.equals(this.bimId, entity.bimId);
    }
}