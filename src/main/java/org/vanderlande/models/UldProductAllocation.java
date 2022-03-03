package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_ULD_PRODUCT_ALLOCATIONS")
public class UldProductAllocation {
    @EmbeddedId
    private UldProductAllocationId id;

    @MapsId("pctId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PCT_ID", nullable = false)
    private Product pct;

    @MapsId("uinId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UIN_ID", nullable = false)
    private UldInstance uin;

    public UldInstance getUin() {
        return uin;
    }

    public void setUin(UldInstance uin) {
        this.uin = uin;
    }

    public Product getPct() {
        return pct;
    }

    public void setPct(Product pct) {
        this.pct = pct;
    }

    public UldProductAllocationId getId() {
        return id;
    }

    public void setId(UldProductAllocationId id) {
        this.id = id;
    }
}