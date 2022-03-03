package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_ULD_EVENTS")
public class UldEvent {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UIN_ID", nullable = false)
    private UldInstance odbUldInstances;

    @Column(name = "DATE_EVENT", nullable = false)
    private Instant dateEvent;

    @Column(name = "EVENT_TYPE", nullable = false, length = 80)
    private String eventType;

    @Column(name = "AIRLINE", length = 3)
    private String airline;

    @Column(name = "ASSIGNED_DESTINATION", length = 80)
    private String assignedDestination;

    @Column(name = "BUILD_STATUS", length = 8)
    private String buildStatus;

    @Column(name = "FLIGHT_NUMBER", length = 5)
    private String flightNumber;

    @Column(name = "LOCATION", length = 110)
    private String location;

    @Column(name = "DATE_SCHEDULED")
    private Instant dateScheduled;

    @Column(name = "SUB_DETAILS", length = 75)
    private String subDetails;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public String getSubDetails() {
        return subDetails;
    }

    public void setSubDetails(String subDetails) {
        this.subDetails = subDetails;
    }

    public Instant getDateScheduled() {
        return dateScheduled;
    }

    public void setDateScheduled(Instant dateScheduled) {
        this.dateScheduled = dateScheduled;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getBuildStatus() {
        return buildStatus;
    }

    public void setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
    }

    public String getAssignedDestination() {
        return assignedDestination;
    }

    public void setAssignedDestination(String assignedDestination) {
        this.assignedDestination = assignedDestination;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Instant getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(Instant dateEvent) {
        this.dateEvent = dateEvent;
    }

    public UldInstance getOdbUldInstances() {
        return odbUldInstances;
    }

    public void setOdbUldInstances(UldInstance odbUldInstances) {
        this.odbUldInstances = odbUldInstances;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}