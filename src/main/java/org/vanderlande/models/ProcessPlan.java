package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_PROCESS_PLANS")
public class ProcessPlan {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PPN_ID", nullable = false)
    private ProcessPlanDefinition odbProcessPlanDefinitions;

    @Column(name = "NAME", nullable = false, length = 16)
    private String name;

    @Column(name = "VERSION", nullable = false)
    private Long version;

    @Column(name = "DISPLAY_NAME", nullable = false, length = 20)
    private String displayName;

    @Column(name = "ACTIVATION", nullable = false)
    private Instant activation;

    @Column(name = "EXPIRATION", nullable = false)
    private Instant expiration;

    @Column(name = "AIRLINE", length = 3)
    private String airline;

    @Column(name = "FLIGHT_NUMBER", length = 5)
    private String flightNumber;

    @Column(name = "SD")
    private Instant sd;

    @Column(name = "FLIGHT_DIRECTION", length = 1)
    private String flightDirection;

    @Column(name = "DATE_SCHEDULED")
    private Instant dateScheduled;

    @Column(name = "DATE_ESTIMATED")
    private Instant dateEstimated;

    @Column(name = "DATE_ONBLOCK")
    private Instant dateOnblock;

    @Column(name = "DATE_OFFBLOCK")
    private Instant dateOffblock;

    @Column(name = "AIRPORT", length = 3)
    private String airport;

    @Column(name = "AIRCRAFT_REGISTRATION", length = 10)
    private String aircraftRegistration;

    @Column(name = "STAND", length = 64)
    private String stand;

    @Column(name = "GATE", length = 8)
    private String gate;

    @Column(name = "STATE", nullable = false, length = 10)
    private String state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HLR_ID")
    private Handler odbHandlers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HAA_ID_FLIGHT")
    private HandlingArea odbHandlingAreas;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    @OneToMany(mappedBy = "odbProcessPlan")
    private Set<PhysicalBag> odbPhysicalBags = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProcessPlans")
    private Set<Phase> odbPhases = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProcessPlans")
    private Set<Process> odbProcesses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProcessPlans")
    private Set<BidMessage> odbBidMessages = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProcessPlans")
    private Set<MetricSubjectInstance> odbMetricSubjectInstances = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProcessPlans")
    private Set<UldTask> odbUldTasks = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProcessPlans")
    private Set<Product> odbProducts = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProcessPlans")
    private Set<FlightIdentification> odbFlightIdentifications = new LinkedHashSet<>();

    public Set<FlightIdentification> getOdbFlightIdentifications() {
        return odbFlightIdentifications;
    }

    public void setOdbFlightIdentifications(Set<FlightIdentification> odbFlightIdentifications) {
        this.odbFlightIdentifications = odbFlightIdentifications;
    }

    public Set<Product> getOdbProducts() {
        return odbProducts;
    }

    public void setOdbProducts(Set<Product> odbProducts) {
        this.odbProducts = odbProducts;
    }

    public Set<UldTask> getOdbUldTasks() {
        return odbUldTasks;
    }

    public void setOdbUldTasks(Set<UldTask> odbUldTasks) {
        this.odbUldTasks = odbUldTasks;
    }

    public Set<MetricSubjectInstance> getOdbMetricSubjectInstances() {
        return odbMetricSubjectInstances;
    }

    public void setOdbMetricSubjectInstances(Set<MetricSubjectInstance> odbMetricSubjectInstances) {
        this.odbMetricSubjectInstances = odbMetricSubjectInstances;
    }

    public Set<BidMessage> getOdbBidMessages() {
        return odbBidMessages;
    }

    public void setOdbBidMessages(Set<BidMessage> odbBidMessages) {
        this.odbBidMessages = odbBidMessages;
    }

    public Set<Process> getOdbProcesses() {
        return odbProcesses;
    }

    public void setOdbProcesses(Set<Process> odbProcesses) {
        this.odbProcesses = odbProcesses;
    }

    public Set<Phase> getOdbPhases() {
        return odbPhases;
    }

    public void setOdbPhases(Set<Phase> odbPhases) {
        this.odbPhases = odbPhases;
    }

    public Set<PhysicalBag> getOdbPhysicalBags() {
        return odbPhysicalBags;
    }

    public void setOdbPhysicalBags(Set<PhysicalBag> odbPhysicalBags) {
        this.odbPhysicalBags = odbPhysicalBags;
    }

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public Handler getOdbHandlers() {
        return odbHandlers;
    }

    public void setOdbHandlers(Handler odbHandlers) {
        this.odbHandlers = odbHandlers;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getStand() {
        return stand;
    }

    public void setStand(String stand) {
        this.stand = stand;
    }

    public String getAircraftRegistration() {
        return aircraftRegistration;
    }

    public void setAircraftRegistration(String aircraftRegistration) {
        this.aircraftRegistration = aircraftRegistration;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public Instant getDateOffblock() {
        return dateOffblock;
    }

    public void setDateOffblock(Instant dateOffblock) {
        this.dateOffblock = dateOffblock;
    }

    public Instant getDateOnblock() {
        return dateOnblock;
    }

    public void setDateOnblock(Instant dateOnblock) {
        this.dateOnblock = dateOnblock;
    }

    public Instant getDateEstimated() {
        return dateEstimated;
    }

    public void setDateEstimated(Instant dateEstimated) {
        this.dateEstimated = dateEstimated;
    }

    public Instant getDateScheduled() {
        return dateScheduled;
    }

    public void setDateScheduled(Instant dateScheduled) {
        this.dateScheduled = dateScheduled;
    }

    public String getFlightDirection() {
        return flightDirection;
    }

    public void setFlightDirection(String flightDirection) {
        this.flightDirection = flightDirection;
    }

    public Instant getSd() {
        return sd;
    }

    public void setSd(Instant sd) {
        this.sd = sd;
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

    public Instant getExpiration() {
        return expiration;
    }

    public void setExpiration(Instant expiration) {
        this.expiration = expiration;
    }

    public Instant getActivation() {
        return activation;
    }

    public void setActivation(Instant activation) {
        this.activation = activation;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProcessPlanDefinition getOdbProcessPlanDefinitions() {
        return odbProcessPlanDefinitions;
    }

    public void setOdbProcessPlanDefinitions(ProcessPlanDefinition odbProcessPlanDefinitions) {
        this.odbProcessPlanDefinitions = odbProcessPlanDefinitions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}