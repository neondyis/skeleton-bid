package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_STATION_AVAILABILITY_DOM")
public class StationAvailabilityDom {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "SEVERITY_LEVEL", nullable = false)
    private Long severityLevel;

    @Column(name = "NAME", nullable = false, length = 24)
    private String name;

    @Column(name = "IND_CONSIDER_AVAILABLE", nullable = false)
    private Long indConsiderAvailable;

    @OneToMany(mappedBy = "odbStationAvailabilityDom")
    private Set<StationAvailability> odbStationAvailabilities = new LinkedHashSet<>();

    public Set<StationAvailability> getOdbStationAvailabilities() {
        return odbStationAvailabilities;
    }

    public void setOdbStationAvailabilities(Set<StationAvailability> odbStationAvailabilities) {
        this.odbStationAvailabilities = odbStationAvailabilities;
    }

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