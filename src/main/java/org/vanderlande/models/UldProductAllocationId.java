package org.vanderlande.models;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UldProductAllocationId implements Serializable {
    private static final long serialVersionUID = -74104316654246238L;
    @Column(name = "PCT_ID", nullable = false)
    private Long pctId;
    @Column(name = "UIN_ID", nullable = false)
    private Long uinId;

    public Long getUinId() {
        return uinId;
    }

    public void setUinId(Long uinId) {
        this.uinId = uinId;
    }

    public Long getPctId() {
        return pctId;
    }

    public void setPctId(Long pctId) {
        this.pctId = pctId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pctId, uinId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UldProductAllocationId entity = (UldProductAllocationId) o;
        return Objects.equals(this.pctId, entity.pctId) &&
                Objects.equals(this.uinId, entity.uinId);
    }
}