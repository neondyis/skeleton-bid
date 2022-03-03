package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_BATCH_TASKS")
public class BatchTask {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_EXT", nullable = false)
    private Long idExt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HAA_ID", nullable = false)
    private HandlingArea odbHandlingAreas;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ULC_ID", nullable = false)
    private UldCategory odbUldCategories;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACY_ID", nullable = false)
    private Activity odbActivities;

    @Column(name = "NR_BATCHES_CREATED", nullable = false)
    private Long nrBatchesCreated;

    @Column(name = "NR_BATCHES_ESTIMATED", nullable = false)
    private Double nrBatchesEstimated;

    @Column(name = "NR_BATCHES_PLANNED")
    private Long nrBatchesPlanned;

    @Column(name = "PRIORITY", nullable = false)
    private Long priority;

    @Column(name = "PRIORITY_TYPE", nullable = false, length = 10)
    private String priorityType;

    @Column(name = "STATE", nullable = false, length = 30)
    private String state;

    @Column(name = "ULD_FILL_RATE")
    private Long uldFillRate;

    @Column(name = "DATE_MODIFIED", nullable = false)
    private Instant dateModified;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    @ManyToMany
    @JoinTable(name = "ODB_BATCH_TASK_STATIONS",
            joinColumns = @JoinColumn(name = "BTK_ID"),
            inverseJoinColumns = @JoinColumn(name = "STN_ID"))
    private Set<Station> odbStations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbBatchTasks")
    private Set<Batch> odbBatches = new LinkedHashSet<>();

    public Set<Batch> getOdbBatches() {
        return odbBatches;
    }

    public void setOdbBatches(Set<Batch> odbBatches) {
        this.odbBatches = odbBatches;
    }

    public Set<Station> getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Set<Station> odbStations) {
        this.odbStations = odbStations;
    }

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }

    public Long getUldFillRate() {
        return uldFillRate;
    }

    public void setUldFillRate(Long uldFillRate) {
        this.uldFillRate = uldFillRate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPriorityType() {
        return priorityType;
    }

    public void setPriorityType(String priorityType) {
        this.priorityType = priorityType;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Long getNrBatchesPlanned() {
        return nrBatchesPlanned;
    }

    public void setNrBatchesPlanned(Long nrBatchesPlanned) {
        this.nrBatchesPlanned = nrBatchesPlanned;
    }

    public Double getNrBatchesEstimated() {
        return nrBatchesEstimated;
    }

    public void setNrBatchesEstimated(Double nrBatchesEstimated) {
        this.nrBatchesEstimated = nrBatchesEstimated;
    }

    public Long getNrBatchesCreated() {
        return nrBatchesCreated;
    }

    public void setNrBatchesCreated(Long nrBatchesCreated) {
        this.nrBatchesCreated = nrBatchesCreated;
    }

    public Activity getOdbActivities() {
        return odbActivities;
    }

    public void setOdbActivities(Activity odbActivities) {
        this.odbActivities = odbActivities;
    }

    public UldCategory getOdbUldCategories() {
        return odbUldCategories;
    }

    public void setOdbUldCategories(UldCategory odbUldCategories) {
        this.odbUldCategories = odbUldCategories;
    }

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public Long getIdExt() {
        return idExt;
    }

    public void setIdExt(Long idExt) {
        this.idExt = idExt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}