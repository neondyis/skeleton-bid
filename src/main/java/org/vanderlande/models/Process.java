package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_PROCESSES")
public class Process {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DATE_FIRST_BAG")
    private Instant dateFirstBag;

    @Column(name = "DATE_LAST_BAG")
    private Instant dateLastBag;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PPL_ID", nullable = false)
    private ProcessPlan odbProcessPlans;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PDN_ID", nullable = false)
    private ProcessDefinition odbProcessDefinitions;

    @OneToMany(mappedBy = "odbProcess")
    private Set<PhysicalBag> odbPhysicalBags = new LinkedHashSet<>();

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "odbProcesses")
    private OperationStatus odbOperationStatuses;

    @OneToMany(mappedBy = "processes")
    private Set<Activity> odbActivities = new LinkedHashSet<>();

    public Set<Activity> getOdbActivities() {
        return odbActivities;
    }

    public void setOdbActivities(Set<Activity> odbActivities) {
        this.odbActivities = odbActivities;
    }

    public OperationStatus getOdbOperationStatuses() {
        return odbOperationStatuses;
    }

    public void setOdbOperationStatuses(OperationStatus odbOperationStatuses) {
        this.odbOperationStatuses = odbOperationStatuses;
    }

    public Set<PhysicalBag> getOdbPhysicalBags() {
        return odbPhysicalBags;
    }

    public void setOdbPhysicalBags(Set<PhysicalBag> odbPhysicalBags) {
        this.odbPhysicalBags = odbPhysicalBags;
    }

    public ProcessDefinition getOdbProcessDefinitions() {
        return odbProcessDefinitions;
    }

    public void setOdbProcessDefinitions(ProcessDefinition odbProcessDefinitions) {
        this.odbProcessDefinitions = odbProcessDefinitions;
    }

    public ProcessPlan getOdbProcessPlans() {
        return odbProcessPlans;
    }

    public void setOdbProcessPlans(ProcessPlan odbProcessPlans) {
        this.odbProcessPlans = odbProcessPlans;
    }

    public Instant getDateLastBag() {
        return dateLastBag;
    }

    public void setDateLastBag(Instant dateLastBag) {
        this.dateLastBag = dateLastBag;
    }

    public Instant getDateFirstBag() {
        return dateFirstBag;
    }

    public void setDateFirstBag(Instant dateFirstBag) {
        this.dateFirstBag = dateFirstBag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}