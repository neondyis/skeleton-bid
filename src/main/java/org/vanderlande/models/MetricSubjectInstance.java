package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_METRIC_SUBJECT_INSTANCES")
public class MetricSubjectInstance {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PDN_ID")
    private ProcessDefinition pdn;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MIN_ID", nullable = false)
    private MetricInstance odbMetricInstances;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MSU_ID", nullable = false)
    private MetricSubject odbMetricSubjects;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STN_ID")
    private Station odbStations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SST_ID")
    private StatusSegment odbStatusSegments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HAA_ID")
    private HandlingArea odbHandlingAreas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LNK_ID")
    private HandlingAreaLink odbHandlingAreaLinks;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LSP_ID")
    private LogisticStep odbLogisticSteps;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PPL_ID")
    private ProcessPlan odbProcessPlans;

    public ProcessPlan getOdbProcessPlans() {
        return odbProcessPlans;
    }

    public void setOdbProcessPlans(ProcessPlan odbProcessPlans) {
        this.odbProcessPlans = odbProcessPlans;
    }

    public LogisticStep getOdbLogisticSteps() {
        return odbLogisticSteps;
    }

    public void setOdbLogisticSteps(LogisticStep odbLogisticSteps) {
        this.odbLogisticSteps = odbLogisticSteps;
    }

    public HandlingAreaLink getOdbHandlingAreaLinks() {
        return odbHandlingAreaLinks;
    }

    public void setOdbHandlingAreaLinks(HandlingAreaLink odbHandlingAreaLinks) {
        this.odbHandlingAreaLinks = odbHandlingAreaLinks;
    }

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public StatusSegment getOdbStatusSegments() {
        return odbStatusSegments;
    }

    public void setOdbStatusSegments(StatusSegment odbStatusSegments) {
        this.odbStatusSegments = odbStatusSegments;
    }

    public Station getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Station odbStations) {
        this.odbStations = odbStations;
    }

    public MetricSubject getOdbMetricSubjects() {
        return odbMetricSubjects;
    }

    public void setOdbMetricSubjects(MetricSubject odbMetricSubjects) {
        this.odbMetricSubjects = odbMetricSubjects;
    }

    public MetricInstance getOdbMetricInstances() {
        return odbMetricInstances;
    }

    public void setOdbMetricInstances(MetricInstance odbMetricInstances) {
        this.odbMetricInstances = odbMetricInstances;
    }

    public ProcessDefinition getPdn() {
        return pdn;
    }

    public void setPdn(ProcessDefinition pdn) {
        this.pdn = pdn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}