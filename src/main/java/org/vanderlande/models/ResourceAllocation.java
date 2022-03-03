package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_RESOURCE_ALLOCATIONS")
public class ResourceAllocation {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PHE_ID", nullable = false)
    private Phase odbPhases;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HAA_ID")
    private HandlingArea odbHandlingAreas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STN_ID")
    private Station odbStations;

    public Station getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Station odbStations) {
        this.odbStations = odbStations;
    }

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public Phase getOdbPhases() {
        return odbPhases;
    }

    public void setOdbPhases(Phase odbPhases) {
        this.odbPhases = odbPhases;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}