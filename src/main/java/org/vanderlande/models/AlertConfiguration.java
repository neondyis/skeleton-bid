package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_ALERT_CONFIGURATIONS")
public class AlertConfiguration {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRF_ID", nullable = false)
    private Profile odbProfiles;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MIN_ID_TARGET")
    private MetricInstance odbMetricInstances;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MIN_ID_REFERENCE")
    private MetricInstance odbMetricInstances1;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MTC_ID", nullable = false)
    private Metric odbMetrics;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PPN_ID")
    private ProcessPlanDefinition odbProcessPlanDefinitions;

    @Column(name = "SEVERITY", nullable = false, length = 5)
    private String severity;

    @Column(name = "COMPARISON_OPERATOR", nullable = false, length = 12)
    private String comparisonOperator;

    @Column(name = "THRESHOLD", nullable = false)
    private Double threshold;

    @Column(name = "CONFIG_TYPE", nullable = false, length = 8)
    private String configType;

    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public String getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ProcessPlanDefinition getOdbProcessPlanDefinitions() {
        return odbProcessPlanDefinitions;
    }

    public void setOdbProcessPlanDefinitions(ProcessPlanDefinition odbProcessPlanDefinitions) {
        this.odbProcessPlanDefinitions = odbProcessPlanDefinitions;
    }

    public Metric getOdbMetrics() {
        return odbMetrics;
    }

    public void setOdbMetrics(Metric odbMetrics) {
        this.odbMetrics = odbMetrics;
    }

    public MetricInstance getOdbMetricInstances1() {
        return odbMetricInstances1;
    }

    public void setOdbMetricInstances1(MetricInstance odbMetricInstances1) {
        this.odbMetricInstances1 = odbMetricInstances1;
    }

    public MetricInstance getOdbMetricInstances() {
        return odbMetricInstances;
    }

    public void setOdbMetricInstances(MetricInstance odbMetricInstances) {
        this.odbMetricInstances = odbMetricInstances;
    }

    public Profile getOdbProfiles() {
        return odbProfiles;
    }

    public void setOdbProfiles(Profile odbProfiles) {
        this.odbProfiles = odbProfiles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}