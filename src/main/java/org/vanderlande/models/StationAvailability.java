package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_STATION_AVAILABILITIES")
public class StationAvailability {
    @Id
    @Column(name = "STN_ID", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STN_ID", nullable = false)
    private Station odbStations;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SAM_ID", nullable = false)
    private StationAvailabilityDom odbStationAvailabilityDom;

    @Column(name = "OPERATIONAL_STATE", length = 15)
    private String operationalState;

    @Column(name = "FUNCTION_MODE", length = 16)
    private String functionMode;

    @Column(name = "DATE_MODIFIED", nullable = false)
    private Instant dateModified;

    @Column(name = "DATE_EVENT", nullable = false)
    private Instant dateEvent;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public Instant getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(Instant dateEvent) {
        this.dateEvent = dateEvent;
    }

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }

    public String getFunctionMode() {
        return functionMode;
    }

    public void setFunctionMode(String functionMode) {
        this.functionMode = functionMode;
    }

    public String getOperationalState() {
        return operationalState;
    }

    public void setOperationalState(String operationalState) {
        this.operationalState = operationalState;
    }

    public StationAvailabilityDom getOdbStationAvailabilityDom() {
        return odbStationAvailabilityDom;
    }

    public void setOdbStationAvailabilityDom(StationAvailabilityDom odbStationAvailabilityDom) {
        this.odbStationAvailabilityDom = odbStationAvailabilityDom;
    }

    public Station getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Station odbStations) {
        this.odbStations = odbStations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}