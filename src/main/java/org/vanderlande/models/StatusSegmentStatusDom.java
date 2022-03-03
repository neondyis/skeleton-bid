package org.vanderlande.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ODB_STATUS_SEGMENT_STATUS_DOM")
public class StatusSegmentStatusDom {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "SEVERITY_LEVEL", nullable = false)
    private Long severityLevel;

    @Column(name = "NAME", nullable = false, length = 24)
    private String name;

    @Column(name = "IND_CONSIDER_AVAILABLE", nullable = false)
    private Long indConsiderAvailable;

    public Long getIndConsiderAvailable() {
        return indConsiderAvailable;
    }

    public void setIndConsiderAvailable(Long indConsiderAvailable) {
        this.indConsiderAvailable = indConsiderAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(Long severityLevel) {
        this.severityLevel = severityLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}