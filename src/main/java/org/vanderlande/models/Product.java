package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_PRODUCTS")
public class Product {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 30)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PPL_ID", nullable = false)
    private ProcessPlan odbProcessPlans;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FLY_ID", nullable = false)
    private Family odbFamilies;

    @Column(name = "PRIORITY", nullable = false)
    private Long priority;

    @Column(name = "NR_ESTIMATED_BATCHES", nullable = false)
    private Double nrEstimatedBatches;

    @OneToMany(mappedBy = "odbProduct")
    private Set<PhysicalBag> odbPhysicalBags = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "ODB_ULD_PRODUCT_ALLOCATIONS",
            joinColumns = @JoinColumn(name = "PCT_ID"),
            inverseJoinColumns = @JoinColumn(name = "UIN_ID"))
    private Set<UldInstance> odbUldInstances = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProducts")
    private Set<ProductAllocation> odbProductAllocations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "products")
    private Set<Activity> odbActivities = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProducts")
    private Set<UldTask> odbUldTasks = new LinkedHashSet<>();

    public Set<UldTask> getOdbUldTasks() {
        return odbUldTasks;
    }

    public void setOdbUldTasks(Set<UldTask> odbUldTasks) {
        this.odbUldTasks = odbUldTasks;
    }

    public Set<Activity> getOdbActivities() {
        return odbActivities;
    }

    public void setOdbActivities(Set<Activity> odbActivities) {
        this.odbActivities = odbActivities;
    }

    public Set<ProductAllocation> getOdbProductAllocations() {
        return odbProductAllocations;
    }

    public void setOdbProductAllocations(Set<ProductAllocation> odbProductAllocations) {
        this.odbProductAllocations = odbProductAllocations;
    }

    public Set<UldInstance> getOdbUldInstances() {
        return odbUldInstances;
    }

    public void setOdbUldInstances(Set<UldInstance> odbUldInstances) {
        this.odbUldInstances = odbUldInstances;
    }

    public Set<PhysicalBag> getOdbPhysicalBags() {
        return odbPhysicalBags;
    }

    public void setOdbPhysicalBags(Set<PhysicalBag> odbPhysicalBags) {
        this.odbPhysicalBags = odbPhysicalBags;
    }

    public Double getNrEstimatedBatches() {
        return nrEstimatedBatches;
    }

    public void setNrEstimatedBatches(Double nrEstimatedBatches) {
        this.nrEstimatedBatches = nrEstimatedBatches;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Family getOdbFamilies() {
        return odbFamilies;
    }

    public void setOdbFamilies(Family odbFamilies) {
        this.odbFamilies = odbFamilies;
    }

    public ProcessPlan getOdbProcessPlans() {
        return odbProcessPlans;
    }

    public void setOdbProcessPlans(ProcessPlan odbProcessPlans) {
        this.odbProcessPlans = odbProcessPlans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}