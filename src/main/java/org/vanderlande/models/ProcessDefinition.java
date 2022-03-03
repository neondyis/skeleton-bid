package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_PROCESS_DEFINITIONS")
public class ProcessDefinition {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PPN_ID", nullable = false)
    private ProcessPlanDefinition odbProcessPlanDefinitions;

    @Column(name = "NAME", nullable = false, length = 64)
    private String name;

    @Column(name = "DISPLAY_NAME", nullable = false, length = 20)
    private String displayName;

    @Column(name = "ASSIGNED_SYSTEM", nullable = false, length = 25)
    private String assignedSystem;

    @Column(name = "IND_BATCH", nullable = false)
    private Long indBatch;

    @Column(name = "PRIORITY", nullable = false)
    private Long priority;

    @OneToMany(mappedBy = "odbProcessDefinitions")
    private Set<Process> odbProcesses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "pdn")
    private Set<MetricSubjectInstance> odbMetricSubjectInstances = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProcessDefinitions")
    private Set<PhysicalClass> odbPhysicalClasses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProcessDefinitions")
    private Set<PhaseDefinition> odbPhaseDefinitions = new LinkedHashSet<>();

    public Set<PhaseDefinition> getOdbPhaseDefinitions() {
        return odbPhaseDefinitions;
    }

    public void setOdbPhaseDefinitions(Set<PhaseDefinition> odbPhaseDefinitions) {
        this.odbPhaseDefinitions = odbPhaseDefinitions;
    }

    public Set<PhysicalClass> getOdbPhysicalClasses() {
        return odbPhysicalClasses;
    }

    public void setOdbPhysicalClasses(Set<PhysicalClass> odbPhysicalClasses) {
        this.odbPhysicalClasses = odbPhysicalClasses;
    }

    public Set<MetricSubjectInstance> getOdbMetricSubjectInstances() {
        return odbMetricSubjectInstances;
    }

    public void setOdbMetricSubjectInstances(Set<MetricSubjectInstance> odbMetricSubjectInstances) {
        this.odbMetricSubjectInstances = odbMetricSubjectInstances;
    }

    public Set<Process> getOdbProcesses() {
        return odbProcesses;
    }

    public void setOdbProcesses(Set<Process> odbProcesses) {
        this.odbProcesses = odbProcesses;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Long getIndBatch() {
        return indBatch;
    }

    public void setIndBatch(Long indBatch) {
        this.indBatch = indBatch;
    }

    public String getAssignedSystem() {
        return assignedSystem;
    }

    public void setAssignedSystem(String assignedSystem) {
        this.assignedSystem = assignedSystem;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProcessPlanDefinition getOdbProcessPlanDefinitions() {
        return odbProcessPlanDefinitions;
    }

    public void setOdbProcessPlanDefinitions(ProcessPlanDefinition odbProcessPlanDefinitions) {
        this.odbProcessPlanDefinitions = odbProcessPlanDefinitions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}