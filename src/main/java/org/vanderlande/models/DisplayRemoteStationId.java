package org.vanderlande.models;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DisplayRemoteStationId implements Serializable {
    private static final long serialVersionUID = 445625288039840668L;
    @Column(name = "STN_ID", nullable = false)
    private Long stnId;
    @Column(name = "DCS_ID", nullable = false)
    private Long dcsId;

    public Long getDcsId() {
        return dcsId;
    }

    public void setDcsId(Long dcsId) {
        this.dcsId = dcsId;
    }

    public Long getStnId() {
        return stnId;
    }

    public void setStnId(Long stnId) {
        this.stnId = stnId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dcsId, stnId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DisplayRemoteStationId entity = (DisplayRemoteStationId) o;
        return Objects.equals(this.dcsId, entity.dcsId) &&
                Objects.equals(this.stnId, entity.stnId);
    }
}