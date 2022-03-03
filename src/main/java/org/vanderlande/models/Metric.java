package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_METRICS")
public class Metric {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_EXT", nullable = false)
    private Long idExt;

    @Column(name = "METRIC_TYPE", nullable = false, length = 40)
    private String metricType;

    @Column(name = "DOMAIN_TYPE", nullable = false, length = 30)
    private String domainType;

    @Column(name = "ASSIGNED_SYSTEM", nullable = false, length = 25)
    private String assignedSystem;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(mappedBy = "odbMetrics")
    private Set<AlertConfiguration> odbAlertConfigurations = new LinkedHashSet<>();

    public Set<AlertConfiguration> getOdbAlertConfigurations() {
        return odbAlertConfigurations;
    }

    public void setOdbAlertConfigurations(Set<AlertConfiguration> odbAlertConfigurations) {
        this.odbAlertConfigurations = odbAlertConfigurations;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedSystem() {
        return assignedSystem;
    }

    public void setAssignedSystem(String assignedSystem) {
        this.assignedSystem = assignedSystem;
    }

    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    public String getMetricType() {
        return metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
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