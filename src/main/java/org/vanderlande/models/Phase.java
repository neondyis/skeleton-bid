package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_PHASES")
public class Phase {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACY_ID", nullable = false)
    private Activity odbActivities;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PHN_ID", nullable = false)
    private PhaseDefinition odbPhaseDefinitions;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PPL_ID", nullable = false)
    private ProcessPlan odbProcessPlans;

    @Column(name = "NAME", nullable = false, length = 64)
    private String name;

    @Column(name = "ACTIVATION", nullable = false)
    private Instant activation;

    @Column(name = "EXPIRATION", nullable = false)
    private Instant expiration;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    @OneToMany(mappedBy = "odbPhases")
    private Set<PhaseAllocation> odbPhaseAllocations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbPhase")
    private Set<PhysicalBag> odbPhysicalBags = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbPhases")
    private Set<UldPhaseAllocation> odbUldPhaseAllocations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbPhases")
    private Set<ResourceAllocation> odbResourceAllocations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbPhases")
    private Set<Package> odbPackages = new LinkedHashSet<>();

    public Set<Package> getOdbPackages() {
        return odbPackages;
    }

    public void setOdbPackages(Set<Package> odbPackages) {
        this.odbPackages = odbPackages;
    }

    public Set<ResourceAllocation> getOdbResourceAllocations() {
        return odbResourceAllocations;
    }

    public void setOdbResourceAllocations(Set<ResourceAllocation> odbResourceAllocations) {
        this.odbResourceAllocations = odbResourceAllocations;
    }

    public Set<UldPhaseAllocation> getOdbUldPhaseAllocations() {
        return odbUldPhaseAllocations;
    }

    public void setOdbUldPhaseAllocations(Set<UldPhaseAllocation> odbUldPhaseAllocations) {
        this.odbUldPhaseAllocations = odbUldPhaseAllocations;
    }

    public Set<PhysicalBag> getOdbPhysicalBags() {
        return odbPhysicalBags;
    }

    public void setOdbPhysicalBags(Set<PhysicalBag> odbPhysicalBags) {
        this.odbPhysicalBags = odbPhysicalBags;
    }

    public Set<PhaseAllocation> getOdbPhaseAllocations() {
        return odbPhaseAllocations;
    }

    public void setOdbPhaseAllocations(Set<PhaseAllocation> odbPhaseAllocations) {
        this.odbPhaseAllocations = odbPhaseAllocations;
    }

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public Instant getExpiration() {
        return expiration;
    }

    public void setExpiration(Instant expiration) {
        this.expiration = expiration;
    }

    public Instant getActivation() {
        return activation;
    }

    public void setActivation(Instant activation) {
        this.activation = activation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProcessPlan getOdbProcessPlans() {
        return odbProcessPlans;
    }

    public void setOdbProcessPlans(ProcessPlan odbProcessPlans) {
        this.odbProcessPlans = odbProcessPlans;
    }

    public PhaseDefinition getOdbPhaseDefinitions() {
        return odbPhaseDefinitions;
    }

    public void setOdbPhaseDefinitions(PhaseDefinition odbPhaseDefinitions) {
        this.odbPhaseDefinitions = odbPhaseDefinitions;
    }

    public Activity getOdbActivities() {
        return odbActivities;
    }

    public void setOdbActivities(Activity odbActivities) {
        this.odbActivities = odbActivities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}