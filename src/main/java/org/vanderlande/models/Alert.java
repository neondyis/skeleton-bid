package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_ALERTS")
public class Alert {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACN_ID", nullable = false)
    private AlertConfiguration odbAlertConfigurations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MIN_ID")
    private MetricInstance odbMetricInstances;

    @Column(name = "IND_ACTIVE", nullable = false)
    private Long indActive;

    @Column(name = "IND_MODIFIED", nullable = false)
    private Long indModified;

    @Column(name = "DATE_MODIFIED", nullable = false)
    private Instant dateModified;

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }

    public Long getIndModified() {
        return indModified;
    }

    public void setIndModified(Long indModified) {
        this.indModified = indModified;
    }

    public Long getIndActive() {
        return indActive;
    }

    public void setIndActive(Long indActive) {
        this.indActive = indActive;
    }

    public MetricInstance getOdbMetricInstances() {
        return odbMetricInstances;
    }

    public void setOdbMetricInstances(MetricInstance odbMetricInstances) {
        this.odbMetricInstances = odbMetricInstances;
    }

    public AlertConfiguration getOdbAlertConfigurations() {
        return odbAlertConfigurations;
    }

    public void setOdbAlertConfigurations(AlertConfiguration odbAlertConfigurations) {
        this.odbAlertConfigurations = odbAlertConfigurations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}