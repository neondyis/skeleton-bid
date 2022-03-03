package org.vanderlande.models;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UldTaskUldId implements Serializable {
    private static final long serialVersionUID = -284904580899344045L;
    @Column(name = "ULD_ID", nullable = false)
    private Long uldId;
    @Column(name = "UTK_ID", nullable = false)
    private Long utkId;

    public Long getUtkId() {
        return utkId;
    }

    public void setUtkId(Long utkId) {
        this.utkId = utkId;
    }

    public Long getUldId() {
        return uldId;
    }

    public void setUldId(Long uldId) {
        this.uldId = uldId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(utkId, uldId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UldTaskUldId entity = (UldTaskUldId) o;
        return Objects.equals(this.utkId, entity.utkId) &&
                Objects.equals(this.uldId, entity.uldId);
    }
}