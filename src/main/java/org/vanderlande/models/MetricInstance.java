package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_METRIC_INSTANCES")
public class MetricInstance {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MTC_ID", nullable = false)
    private Metric odbMetrics;

    @Column(name = "VALUE", nullable = false)
    private Double value;

    @Column(name = "PREVIOUS_VALUE")
    private Double previousValue;

    @Column(name = "DATE_MODIFIED", nullable = false)
    private Instant dateModified;

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }

    public Double getPreviousValue() {
        return previousValue;
    }

    public void setPreviousValue(Double previousValue) {
        this.previousValue = previousValue;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Metric getOdbMetrics() {
        return odbMetrics;
    }

    public void setOdbMetrics(Metric odbMetrics) {
        this.odbMetrics = odbMetrics;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}