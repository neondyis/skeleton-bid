package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_ULD_CATEGORIES")
public class UldCategory {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UTY_ID", nullable = false)
    private UldType odbUldTypes;

    @Column(name = "OWNER_CODE", nullable = false, length = 3)
    private String ownerCode;

    @OneToMany(mappedBy = "odbUldCategories")
    private Set<BatchTask> odbBatchTasks = new LinkedHashSet<>();

    @OneToMany(mappedBy = "uldCategories")
    private Set<Activity> odbActivities = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbUldCategories")
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

    public Set<BatchTask> getOdbBatchTasks() {
        return odbBatchTasks;
    }

    public void setOdbBatchTasks(Set<BatchTask> odbBatchTasks) {
        this.odbBatchTasks = odbBatchTasks;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public UldType getOdbUldTypes() {
        return odbUldTypes;
    }

    public void setOdbUldTypes(UldType odbUldTypes) {
        this.odbUldTypes = odbUldTypes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}