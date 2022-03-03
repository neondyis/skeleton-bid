package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_PRODUCT_ALLOCATIONS")
public class ProductAllocation {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PCT_ID", nullable = false)
    private Product odbProducts;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PBG_ID", nullable = false)
    private PhysicalBag odbPhysicalBags;

    public PhysicalBag getOdbPhysicalBags() {
        return odbPhysicalBags;
    }

    public void setOdbPhysicalBags(PhysicalBag odbPhysicalBags) {
        this.odbPhysicalBags = odbPhysicalBags;
    }

    public Product getOdbProducts() {
        return odbProducts;
    }

    public void setOdbProducts(Product odbProducts) {
        this.odbProducts = odbProducts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}