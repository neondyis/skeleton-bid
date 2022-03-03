package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_PACKAGES")
public class Package {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HAA_ID", nullable = false)
    private HandlingArea odbHandlingAreas;

    @Column(name = "PID", nullable = false)
    private Long pid;

    @Column(name = "BID")
    private Long bid;

    @Column(name = "BID_EXTENSION", length = 3)
    private String bidExtension;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SST_ID_FIRST_SEEN")
    private StatusSegment odbStatusSegments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RST_ID_LAST_SEEN")
    private RouteSegment odbRouteSegments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STN_ID_LAST_PROCESSED")
    private Station odbStations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BAT_ID")
    private Batch odbBatches;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PBG_ID", nullable = false)
    private PhysicalBag odbPhysicalBag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PHE_ID")
    private Phase odbPhases;

    @Column(name = "STATE", nullable = false, length = 10)
    private String state;

    @Column(name = "DATE_FIRST_SEEN")
    private Instant dateFirstSeen;

    @Column(name = "DATE_RECLAIM_ASSIGNMENT")
    private Instant dateReclaimAssignment;

    @Column(name = "DATE_POTENTIAL_LAST_BAG")
    private Instant datePotentialLastBag;

    @Column(name = "DATE_LOGISTICS_MODIFIED")
    private Instant dateLogisticsModified;

    @Column(name = "DATE_PROCESS_MODIFIED")
    private Instant dateProcessModified;

    @Column(name = "DATE_BAG_DATA_MODIFIED")
    private Instant dateBagDataModified;

    @Column(name = "DATE_TASK_EXECUTION")
    private Instant dateTaskExecution;

    @Column(name = "DATE_EXPECTED_DELIVERY")
    private Instant dateExpectedDelivery;

    @Column(name = "DATE_PROBLEM_BAG")
    private Instant dateProblemBag;

    @Column(name = "DATE_DELIVERED")
    private Instant dateDelivered;

    @Column(name = "DATE_LOGISTIC_STEP_ENTRY")
    private Instant dateLogisticStepEntry;

    @Column(name = "DATE_DESTINATION_CHANGE")
    private Instant dateDestinationChange;

    @Column(name = "LOCK_USER_NAME", length = 30)
    private String lockUserName;

    @Column(name = "LAST_LOGISTIC_EXCEPTION", length = 40)
    private String lastLogisticException;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    @OneToMany(mappedBy = "odbPackage")
    private Set<PhysicalBag> odbPhysicalBags = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbPackages")
    private Set<OperationalCtrlMessage> odbOperationalCtrlMessages = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbPackages")
    private Set<AssignedResource> odbAssignedResources = new LinkedHashSet<>();

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "odbPackages")
    private BagData odbBagDatas;

    @OneToMany(mappedBy = "odbPackages")
    private Set<BagTraceEvent> odbBagTraceEvents = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbPackages")
    private Set<LpnReport> odbLpnReports = new LinkedHashSet<>();

    public Set<LpnReport> getOdbLpnReports() {
        return odbLpnReports;
    }

    public void setOdbLpnReports(Set<LpnReport> odbLpnReports) {
        this.odbLpnReports = odbLpnReports;
    }

    public Set<BagTraceEvent> getOdbBagTraceEvents() {
        return odbBagTraceEvents;
    }

    public void setOdbBagTraceEvents(Set<BagTraceEvent> odbBagTraceEvents) {
        this.odbBagTraceEvents = odbBagTraceEvents;
    }

    public BagData getOdbBagDatas() {
        return odbBagDatas;
    }

    public void setOdbBagDatas(BagData odbBagDatas) {
        this.odbBagDatas = odbBagDatas;
    }

    public Set<AssignedResource> getOdbAssignedResources() {
        return odbAssignedResources;
    }

    public void setOdbAssignedResources(Set<AssignedResource> odbAssignedResources) {
        this.odbAssignedResources = odbAssignedResources;
    }

    public Set<OperationalCtrlMessage> getOdbOperationalCtrlMessages() {
        return odbOperationalCtrlMessages;
    }

    public void setOdbOperationalCtrlMessages(Set<OperationalCtrlMessage> odbOperationalCtrlMessages) {
        this.odbOperationalCtrlMessages = odbOperationalCtrlMessages;
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

    public String getLastLogisticException() {
        return lastLogisticException;
    }

    public void setLastLogisticException(String lastLogisticException) {
        this.lastLogisticException = lastLogisticException;
    }

    public String getLockUserName() {
        return lockUserName;
    }

    public void setLockUserName(String lockUserName) {
        this.lockUserName = lockUserName;
    }

    public Instant getDateDestinationChange() {
        return dateDestinationChange;
    }

    public void setDateDestinationChange(Instant dateDestinationChange) {
        this.dateDestinationChange = dateDestinationChange;
    }

    public Instant getDateLogisticStepEntry() {
        return dateLogisticStepEntry;
    }

    public void setDateLogisticStepEntry(Instant dateLogisticStepEntry) {
        this.dateLogisticStepEntry = dateLogisticStepEntry;
    }

    public Instant getDateDelivered() {
        return dateDelivered;
    }

    public void setDateDelivered(Instant dateDelivered) {
        this.dateDelivered = dateDelivered;
    }

    public Instant getDateProblemBag() {
        return dateProblemBag;
    }

    public void setDateProblemBag(Instant dateProblemBag) {
        this.dateProblemBag = dateProblemBag;
    }

    public Instant getDateExpectedDelivery() {
        return dateExpectedDelivery;
    }

    public void setDateExpectedDelivery(Instant dateExpectedDelivery) {
        this.dateExpectedDelivery = dateExpectedDelivery;
    }

    public Instant getDateTaskExecution() {
        return dateTaskExecution;
    }

    public void setDateTaskExecution(Instant dateTaskExecution) {
        this.dateTaskExecution = dateTaskExecution;
    }

    public Instant getDateBagDataModified() {
        return dateBagDataModified;
    }

    public void setDateBagDataModified(Instant dateBagDataModified) {
        this.dateBagDataModified = dateBagDataModified;
    }

    public Instant getDateProcessModified() {
        return dateProcessModified;
    }

    public void setDateProcessModified(Instant dateProcessModified) {
        this.dateProcessModified = dateProcessModified;
    }

    public Instant getDateLogisticsModified() {
        return dateLogisticsModified;
    }

    public void setDateLogisticsModified(Instant dateLogisticsModified) {
        this.dateLogisticsModified = dateLogisticsModified;
    }

    public Instant getDatePotentialLastBag() {
        return datePotentialLastBag;
    }

    public void setDatePotentialLastBag(Instant datePotentialLastBag) {
        this.datePotentialLastBag = datePotentialLastBag;
    }

    public Instant getDateReclaimAssignment() {
        return dateReclaimAssignment;
    }

    public void setDateReclaimAssignment(Instant dateReclaimAssignment) {
        this.dateReclaimAssignment = dateReclaimAssignment;
    }

    public Instant getDateFirstSeen() {
        return dateFirstSeen;
    }

    public void setDateFirstSeen(Instant dateFirstSeen) {
        this.dateFirstSeen = dateFirstSeen;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Phase getOdbPhases() {
        return odbPhases;
    }

    public void setOdbPhases(Phase odbPhases) {
        this.odbPhases = odbPhases;
    }

    public PhysicalBag getOdbPhysicalBag() {
        return odbPhysicalBag;
    }

    public void setOdbPhysicalBag(PhysicalBag odbPhysicalBags) {
        this.odbPhysicalBag = odbPhysicalBags;
    }

    public Batch getOdbBatches() {
        return odbBatches;
    }

    public void setOdbBatches(Batch odbBatches) {
        this.odbBatches = odbBatches;
    }

    public Station getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Station odbStations) {
        this.odbStations = odbStations;
    }

    public RouteSegment getOdbRouteSegments() {
        return odbRouteSegments;
    }

    public void setOdbRouteSegments(RouteSegment odbRouteSegments) {
        this.odbRouteSegments = odbRouteSegments;
    }

    public StatusSegment getOdbStatusSegments() {
        return odbStatusSegments;
    }

    public void setOdbStatusSegments(StatusSegment odbStatusSegments) {
        this.odbStatusSegments = odbStatusSegments;
    }

    public String getBidExtension() {
        return bidExtension;
    }

    public void setBidExtension(String bidExtension) {
        this.bidExtension = bidExtension;
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}