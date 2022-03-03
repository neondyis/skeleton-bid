package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_ULDS")
public class Uld {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UTY_ID")
    private UldType odbUldTypes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UIN_ACTIVE_ID")
    private UldInstance odbUldInstance;

    @Column(name = "SERIAL_NUMBER", length = 6)
    private String serialNumber;

    @Column(name = "OWNER_CODE", length = 3)
    private String ownerCode;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    @ManyToMany
    @JoinTable(name = "ODB_ULD_TASK_ULDS",
            joinColumns = @JoinColumn(name = "ULD_ID"),
            inverseJoinColumns = @JoinColumn(name = "UTK_ID"))
    private Set<UldTask> odbUldTasks = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbUlds")
    private Set<Batch> odbBatches = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbUlds")
    private Set<BagData> odbBagsLoaded = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbUlds1")
    private Set<BagData> odbBagsStored = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbUlds")
    private Set<UldInstance> odbUldInstances = new LinkedHashSet<>();

    public Set<UldInstance> getOdbUldInstances() {
        return odbUldInstances;
    }

    public void setOdbUldInstances(Set<UldInstance> odbUldInstances) {
        this.odbUldInstances = odbUldInstances;
    }

    public Set<BagData> getOdbBagsStored() {
        return odbBagsStored;
    }

    public void setOdbBagsStored(Set<BagData> odbBagsStored) {
        this.odbBagsStored = odbBagsStored;
    }

    public Set<BagData> getOdbBagsLoaded() {
        return odbBagsLoaded;
    }

    public void setOdbBagsLoaded(Set<BagData> odbBagsLoaded) {
        this.odbBagsLoaded = odbBagsLoaded;
    }

    public Set<Batch> getOdbBatches() {
        return odbBatches;
    }

    public void setOdbBatches(Set<Batch> odbBatches) {
        this.odbBatches = odbBatches;
    }

    public Set<UldTask> getOdbUldTasks() {
        return odbUldTasks;
    }

    public void setOdbUldTasks(Set<UldTask> odbUldTasks) {
        this.odbUldTasks = odbUldTasks;
    }

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public UldInstance getOdbUldInstance() {
        return odbUldInstance;
    }

    public void setOdbUldInstance(UldInstance odbUldInstances) {
        this.odbUldInstance = odbUldInstances;
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