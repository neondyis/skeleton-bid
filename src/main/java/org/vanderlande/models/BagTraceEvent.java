package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_BAG_TRACE_EVENTS")
public class BagTraceEvent {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PAE_ID")
    private Package odbPackages;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PBG_ID", nullable = false)
    private PhysicalBag odbPhysicalBags;

    @Column(name = "DATE_EVENT", nullable = false)
    private Instant dateEvent;

    @Column(name = "LPN", length = 10)
    private String lpn;

    @Column(name = "EVENT_TRIGGER", length = 14)
    private String eventTrigger;

    @Column(name = "EVENT_TYPE", nullable = false, length = 80)
    private String eventType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LOCATION_HAA_ID", nullable = false)
    private HandlingArea odbHandlingAreas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOCATION_STN_ID")
    private Station odbStations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOCATION_RST_ID")
    private RouteSegment odbRouteSegments;

    @Column(name = "ASSIGNED_DESTINATIONS", length = 80)
    private String assignedDestinations;

    @Column(name = "AIRLINE", length = 3)
    private String airline;

    @Column(name = "FLIGHT_NUMBER", length = 5)
    private String flightNumber;

    @Column(name = "DATE_SCHEDULED")
    private Instant dateScheduled;

    @Column(name = "FLIGHT_DIRECTION", length = 1)
    private String flightDirection;

    @Column(name = "AREA_ID_REPORTING")
    private Long areaIdReporting;

    @Column(name = "ZONE_ID_REPORTING")
    private Long zoneIdReporting;

    @Column(name = "EQUIPMENT_ID_REPORTING")
    private Long equipmentIdReporting;

    public Long getEquipmentIdReporting() {
        return equipmentIdReporting;
    }

    public void setEquipmentIdReporting(Long equipmentIdReporting) {
        this.equipmentIdReporting = equipmentIdReporting;
    }

    public Long getZoneIdReporting() {
        return zoneIdReporting;
    }

    public void setZoneIdReporting(Long zoneIdReporting) {
        this.zoneIdReporting = zoneIdReporting;
    }

    public Long getAreaIdReporting() {
        return areaIdReporting;
    }

    public void setAreaIdReporting(Long areaIdReporting) {
        this.areaIdReporting = areaIdReporting;
    }

    public String getFlightDirection() {
        return flightDirection;
    }

    public void setFlightDirection(String flightDirection) {
        this.flightDirection = flightDirection;
    }

    public Instant getDateScheduled() {
        return dateScheduled;
    }

    public void setDateScheduled(Instant dateScheduled) {
        this.dateScheduled = dateScheduled;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAssignedDestinations() {
        return assignedDestinations;
    }

    public void setAssignedDestinations(String assignedDestinations) {
        this.assignedDestinations = assignedDestinations;
    }

    public RouteSegment getOdbRouteSegments() {
        return odbRouteSegments;
    }

    public void setOdbRouteSegments(RouteSegment odbRouteSegments) {
        this.odbRouteSegments = odbRouteSegments;
    }

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

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventTrigger() {
        return eventTrigger;
    }

    public void setEventTrigger(String eventTrigger) {
        this.eventTrigger = eventTrigger;
    }

    public String getLpn() {
        return lpn;
    }

    public void setLpn(String lpn) {
        this.lpn = lpn;
    }

    public Instant getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(Instant dateEvent) {
        this.dateEvent = dateEvent;
    }

    public PhysicalBag getOdbPhysicalBags() {
        return odbPhysicalBags;
    }

    public void setOdbPhysicalBags(PhysicalBag odbPhysicalBags) {
        this.odbPhysicalBags = odbPhysicalBags;
    }

    public Package getOdbPackages() {
        return odbPackages;
    }

    public void setOdbPackages(Package odbPackages) {
        this.odbPackages = odbPackages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}