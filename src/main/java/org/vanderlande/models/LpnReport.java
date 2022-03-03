package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_LPN_REPORTS")
public class LpnReport {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PAE_ID", nullable = false)
    private Package odbPackages;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PBG_ID", nullable = false)
    private PhysicalBag odbPhysicalBags;

    @Column(name = "IND_CURRENT", nullable = false)
    private Long indCurrent;

    public Long getIndCurrent() {
        return indCurrent;
    }

    public void setIndCurrent(Long indCurrent) {
        this.indCurrent = indCurrent;
    }

    public PhysicalBag getOdbPhysicalBags() {
        return odbPhysicalBags;
    }

    public void setOdbPhysicalBags(PhysicalBag odbPhysicalBags) {
        this.odbPhysicalBags = odbPhysicalBags;
    }

    public Package getOdbPackages() {
        return odbPackages;
    }

    public void setOdbPackages(Package odbPackages) {
        this.odbPackages = odbPackages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}