package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_ACTIVITIES")
public class Activity {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRS_ID", nullable = false)
    private Process processes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PCT_ID")
    private Product products;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ULC_ID")
    private UldCategory uldCategories;

    @Column(name = "NAME", nullable = false, length = 30)
    private String name;

    @Column(name = "NR_BATCHES_PLANNED")
    private Long nrBatchesPlanned;

    @Column(name = "EJECT_ID", length = 18)
    private String ejectId;

    public String getEjectId() {
        return ejectId;
    }

    public void setEjectId(String ejectId) {
        this.ejectId = ejectId;
    }

    public Long getNrBatchesPlanned() {
        return nrBatchesPlanned;
    }

    public void setNrBatchesPlanned(Long nrBatchesPlanned) {
        this.nrBatchesPlanned = nrBatchesPlanned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UldCategory getUldCategories() {
        return uldCategories;
    }

    public void setUldCategories(UldCategory uldCategories) {
        this.uldCategories = uldCategories;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public Process getProcesses() {
        return processes;
    }

    public void setProcesses(Process processes) {
        this.processes = processes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}