package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_LOGISTIC_STEPS")
public class LogisticStep {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_EXT", nullable = false)
    private Long idExt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HAA_ID", nullable = false)
    private HandlingArea odbHandlingAreas;

    @Column(name = "NAME", nullable = false, length = 40)
    private String name;

    @Column(name = "DESCRIPTION", nullable = false, length = 64)
    private String description;

    @Column(name = "\"TYPE\"", nullable = false, length = 20)
    private String type;

    @Column(name = "ASSIGNED_SYSTEM", nullable = false, length = 25)
    private String assignedSystem;

    @Column(name = "MAXIMUM_HOLDING_CAPACITY", nullable = false)
    private Long maximumHoldingCapacity;

    @Column(name = "MAXIMUM_PROCESSING_CAPACITY")
    private Long maximumProcessingCapacity;

    @Column(name = "IND_HAS_LINKS", nullable = false)
    private Long indHasLinks;

    @Column(name = "IND_HAS_TRACKING", nullable = false)
    private Long indHasTracking;

    @Column(name = "IND_HAS_STORES", nullable = false)
    private Long indHasStores;

    @OneToMany(mappedBy = "odbLogisticSteps")
    private Set<Node> odbNodes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbLogisticSteps1")
    private Set<FlowEvent> odbFlowEventsEntry = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbLogisticSteps")
    private Set<FlowEvent> odbFlowEventsExit = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbLogisticSteps")
    private Set<StatusSegment> odbStatusSegments = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbLogisticSteps")
    private Set<Station> odbStations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbLogisticSteps")
    private Set<MetricSubjectInstance> odbMetricSubjectInstances = new LinkedHashSet<>();

    public Set<MetricSubjectInstance> getOdbMetricSubjectInstances() {
        return odbMetricSubjectInstances;
    }

    public void setOdbMetricSubjectInstances(Set<MetricSubjectInstance> odbMetricSubjectInstances) {
        this.odbMetricSubjectInstances = odbMetricSubjectInstances;
    }

    public Set<Station> getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Set<Station> odbStations) {
        this.odbStations = odbStations;
    }

    public Set<StatusSegment> getOdbStatusSegments() {
        return odbStatusSegments;
    }

    public void setOdbStatusSegments(Set<StatusSegment> odbStatusSegments) {
        this.odbStatusSegments = odbStatusSegments;
    }

    public Set<FlowEvent> getOdbFlowEventsExit() {
        return odbFlowEventsExit;
    }

    public void setOdbFlowEventsExit(Set<FlowEvent> odbFlowEventsExit) {
        this.odbFlowEventsExit = odbFlowEventsExit;
    }

    public Set<FlowEvent> getOdbFlowEventsEntry() {
        return odbFlowEventsEntry;
    }

    public void setOdbFlowEventsEntry(Set<FlowEvent> odbFlowEventsEntry) {
        this.odbFlowEventsEntry = odbFlowEventsEntry;
    }

    public Set<Node> getOdbNodes() {
        return odbNodes;
    }

    public void setOdbNodes(Set<Node> odbNodes) {
        this.odbNodes = odbNodes;
    }

    public Long getIndHasStores() {
        return indHasStores;
    }

    public void setIndHasStores(Long indHasStores) {
        this.indHasStores = indHasStores;
    }

    public Long getIndHasTracking() {
        return indHasTracking;
    }

    public void setIndHasTracking(Long indHasTracking) {
        this.indHasTracking = indHasTracking;
    }

    public Long getIndHasLinks() {
        return indHasLinks;
    }

    public void setIndHasLinks(Long indHasLinks) {
        this.indHasLinks = indHasLinks;
    }

    public Long getMaximumProcessingCapacity() {
        return maximumProcessingCapacity;
    }

    public void setMaximumProcessingCapacity(Long maximumProcessingCapacity) {
        this.maximumProcessingCapacity = maximumProcessingCapacity;
    }

    public Long getMaximumHoldingCapacity() {
        return maximumHoldingCapacity;
    }

    public void setMaximumHoldingCapacity(Long maximumHoldingCapacity) {
        this.maximumHoldingCapacity = maximumHoldingCapacity;
    }

    public String getAssignedSystem() {
        return assignedSystem;
    }

    public void setAssignedSystem(String assignedSystem) {
        this.assignedSystem = assignedSystem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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