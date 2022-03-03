package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_ALLOWED_RESOURCES")
public class AllowedResource {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PHN_ID", nullable = false)
    private PhaseDefinition odbPhaseDefinitions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STN_ID")
    private Station odbStations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HAA_ID")
    private HandlingArea odbHandlingAreas;

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public Station getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Station odbStations) {
        this.odbStations = odbStations;
    }

    public PhaseDefinition getOdbPhaseDefinitions() {
        return odbPhaseDefinitions;
    }

    public void setOdbPhaseDefinitions(PhaseDefinition odbPhaseDefinitions) {
        this.odbPhaseDefinitions = odbPhaseDefinitions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}