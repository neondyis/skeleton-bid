package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_STATUS_SEGMENTS")
public class StatusSegment {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_EXT", nullable = false)
    private Long idExt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LSP_ID", nullable = false)
    private LogisticStep odbLogisticSteps;

    @Column(name = "DESCRIPTION", nullable = false, length = 30)
    private String description;

    @Column(name = "MAXIMUM_HOLDING_CAPACITY", nullable = false)
    private Long maximumHoldingCapacity;

    @OneToMany(mappedBy = "odbStatusSegments")
    private Set<RouteSegment> odbRouteSegments = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStatusSegments1")
    private Set<FlowEvent> odbFlowEventsEntry = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStatusSegments")
    private Set<FlowEvent> odbFlowEventsExit = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStatusSegments")
    private Set<RouteInfluenceTrigger> odbRouteInfluenceTriggers = new LinkedHashSet<>();

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "odbStatusSegments")
    private StatusSegmentStatus odbStatusSegmentStatuses;

    @OneToMany(mappedBy = "odbStatusSegments")
    private Set<Package> odbPackages = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStatusSegments")
    private Set<MetricSubjectInstance> odbMetricSubjectInstances = new LinkedHashSet<>();

    public Set<MetricSubjectInstance> getOdbMetricSubjectInstances() {
        return odbMetricSubjectInstances;
    }

    public void setOdbMetricSubjectInstances(Set<MetricSubjectInstance> odbMetricSubjectInstances) {
        this.odbMetricSubjectInstances = odbMetricSubjectInstances;
    }

    public Set<Package> getOdbPackages() {
        return odbPackages;
    }

    public void setOdbPackages(Set<Package> odbPackages) {
        this.odbPackages = odbPackages;
    }

    public StatusSegmentStatus getOdbStatusSegmentStatuses() {
        return odbStatusSegmentStatuses;
    }

    public void setOdbStatusSegmentStatuses(StatusSegmentStatus odbStatusSegmentStatuses) {
        this.odbStatusSegmentStatuses = odbStatusSegmentStatuses;
    }

    public Set<RouteInfluenceTrigger> getOdbRouteInfluenceTriggers() {
        return odbRouteInfluenceTriggers;
    }

    public void setOdbRouteInfluenceTriggers(Set<RouteInfluenceTrigger> odbRouteInfluenceTriggers) {
        this.odbRouteInfluenceTriggers = odbRouteInfluenceTriggers;
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

    public Set<RouteSegment> getOdbRouteSegments() {
        return odbRouteSegments;
    }

    public void setOdbRouteSegments(Set<RouteSegment> odbRouteSegments) {
        this.odbRouteSegments = odbRouteSegments;
    }

    public Long getMaximumHoldingCapacity() {
        return maximumHoldingCapacity;
    }

    public void setMaximumHoldingCapacity(Long maximumHoldingCapacity) {
        this.maximumHoldingCapacity = maximumHoldingCapacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LogisticStep getOdbLogisticSteps() {
        return odbLogisticSteps;
    }

    public void setOdbLogisticSteps(LogisticStep odbLogisticSteps) {
        this.odbLogisticSteps = odbLogisticSteps;
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