package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_STATIONS")
public class Station {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_EXT", nullable = false)
    private Long idExt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LSP_ID", nullable = false)
    private LogisticStep odbLogisticSteps;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STT_ID", nullable = false)
    private StationType odbStationTypes;

    @Column(name = "CATEGORY", length = 12)
    private String category;

    @Column(name = "DESCRIPTION", nullable = false, length = 14)
    private String description;

    @Column(name = "DESTINATION_ID")
    private Long destinationId;

    @Column(name = "MAXIMUM_PROCESSING_CAPACITY")
    private Long maximumProcessingCapacity;

    @Column(name = "LOGISTIC_STEP_RANK", length = 12)
    private String logisticStepRank;

    @ManyToMany(mappedBy = "odbStations")
    private Set<DisplayConfiguration> odbRemoteDisplayConfigurations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStations")
    private Set<Node> odbNodes = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "ODB_STATION_BID_MESSAGES",
            joinColumns = @JoinColumn(name = "STN_ID"),
            inverseJoinColumns = @JoinColumn(name = "BIM_ID"))
    private Set<BidMessage> odbBidMessages = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStations")
    private Set<BidConfig> odbBidConfigs = new LinkedHashSet<>();

    @ManyToMany(mappedBy = "odbStations")
    private Set<BatchTask> odbBatchTasks = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStations")
    private Set<ResourceAllocation> odbResourceAllocations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStations")
    private Set<AssignedResource> odbAssignedResources = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStations")
    private Set<Batch> odbBatches = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStations")
    private Set<UldInstance> odbUldInstancesLast = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStations1")
    private Set<UldInstance> odbUldInstancesAssigned = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStations")
    private Set<BagTraceEvent> odbBagTraceEvents = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStation")
    private Set<DisplayConfiguration> odbDisplayConfigurations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStations")
    private Set<Package> odbPackages = new LinkedHashSet<>();

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "odbStations")
    private StationAvailability odbStationAvailabilities;

    @OneToMany(mappedBy = "odbStations")
    private Set<StorageLocation> odbStorageLocations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStations")
    private Set<MetricSubjectInstance> odbMetricSubjectInstances = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStations")
    private Set<AllowedResource> odbAllowedResources = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbStations")
    private Set<UldTask> odbUldTasks = new LinkedHashSet<>();

    public Set<UldTask> getOdbUldTasks() {
        return odbUldTasks;
    }

    public void setOdbUldTasks(Set<UldTask> odbUldTasks) {
        this.odbUldTasks = odbUldTasks;
    }

    public Set<AllowedResource> getOdbAllowedResources() {
        return odbAllowedResources;
    }

    public void setOdbAllowedResources(Set<AllowedResource> odbAllowedResources) {
        this.odbAllowedResources = odbAllowedResources;
    }

    public Set<MetricSubjectInstance> getOdbMetricSubjectInstances() {
        return odbMetricSubjectInstances;
    }

    public void setOdbMetricSubjectInstances(Set<MetricSubjectInstance> odbMetricSubjectInstances) {
        this.odbMetricSubjectInstances = odbMetricSubjectInstances;
    }

    public Set<StorageLocation> getOdbStorageLocations() {
        return odbStorageLocations;
    }

    public void setOdbStorageLocations(Set<StorageLocation> odbStorageLocations) {
        this.odbStorageLocations = odbStorageLocations;
    }

    public StationAvailability getOdbStationAvailabilities() {
        return odbStationAvailabilities;
    }

    public void setOdbStationAvailabilities(StationAvailability odbStationAvailabilities) {
        this.odbStationAvailabilities = odbStationAvailabilities;
    }

    public Set<Package> getOdbPackages() {
        return odbPackages;
    }

    public void setOdbPackages(Set<Package> odbPackages) {
        this.odbPackages = odbPackages;
    }

    public Set<DisplayConfiguration> getOdbDisplayConfigurations() {
        return odbDisplayConfigurations;
    }

    public void setOdbDisplayConfigurations(Set<DisplayConfiguration> odbDisplayConfigurations) {
        this.odbDisplayConfigurations = odbDisplayConfigurations;
    }

    public Set<BagTraceEvent> getOdbBagTraceEvents() {
        return odbBagTraceEvents;
    }

    public void setOdbBagTraceEvents(Set<BagTraceEvent> odbBagTraceEvents) {
        this.odbBagTraceEvents = odbBagTraceEvents;
    }

    public Set<UldInstance> getOdbUldInstancesAssigned() {
        return odbUldInstancesAssigned;
    }

    public void setOdbUldInstancesAssigned(Set<UldInstance> odbUldInstancesAssigned) {
        this.odbUldInstancesAssigned = odbUldInstancesAssigned;
    }

    public Set<UldInstance> getOdbUldInstancesLast() {
        return odbUldInstancesLast;
    }

    public void setOdbUldInstancesLast(Set<UldInstance> odbUldInstancesLast) {
        this.odbUldInstancesLast = odbUldInstancesLast;
    }

    public Set<Batch> getOdbBatches() {
        return odbBatches;
    }

    public void setOdbBatches(Set<Batch> odbBatches) {
        this.odbBatches = odbBatches;
    }

    public Set<AssignedResource> getOdbAssignedResources() {
        return odbAssignedResources;
    }

    public void setOdbAssignedResources(Set<AssignedResource> odbAssignedResources) {
        this.odbAssignedResources = odbAssignedResources;
    }

    public Set<ResourceAllocation> getOdbResourceAllocations() {
        return odbResourceAllocations;
    }

    public void setOdbResourceAllocations(Set<ResourceAllocation> odbResourceAllocations) {
        this.odbResourceAllocations = odbResourceAllocations;
    }

    public Set<BatchTask> getOdbBatchTasks() {
        return odbBatchTasks;
    }

    public void setOdbBatchTasks(Set<BatchTask> odbBatchTasks) {
        this.odbBatchTasks = odbBatchTasks;
    }

    public Set<BidConfig> getOdbBidConfigs() {
        return odbBidConfigs;
    }

    public void setOdbBidConfigs(Set<BidConfig> odbBidConfigs) {
        this.odbBidConfigs = odbBidConfigs;
    }

    public Set<BidMessage> getOdbBidMessages() {
        return odbBidMessages;
    }

    public void setOdbBidMessages(Set<BidMessage> odbBidMessages) {
        this.odbBidMessages = odbBidMessages;
    }

    public Set<Node> getOdbNodes() {
        return odbNodes;
    }

    public void setOdbNodes(Set<Node> odbNodes) {
        this.odbNodes = odbNodes;
    }

    public Set<DisplayConfiguration> getOdbRemoteDisplayConfigurations() {
        return odbRemoteDisplayConfigurations;
    }

    public void setOdbRemoteDisplayConfigurations(Set<DisplayConfiguration> odbRemoteDisplayConfigurations) {
        this.odbRemoteDisplayConfigurations = odbRemoteDisplayConfigurations;
    }

    public String getLogisticStepRank() {
        return logisticStepRank;
    }

    public void setLogisticStepRank(String logisticStepRank) {
        this.logisticStepRank = logisticStepRank;
    }

    public Long getMaximumProcessingCapacity() {
        return maximumProcessingCapacity;
    }

    public void setMaximumProcessingCapacity(Long maximumProcessingCapacity) {
        this.maximumProcessingCapacity = maximumProcessingCapacity;
    }

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public StationType getOdbStationTypes() {
        return odbStationTypes;
    }

    public void setOdbStationTypes(StationType odbStationTypes) {
        this.odbStationTypes = odbStationTypes;
    }

    public LogisticStep getOdbLogisticSteps() {
        return odbLogisticSteps;
    }

    public void setOdbLogisticSteps(LogisticStep odbLogisticSteps) {
        this.odbLogisticSteps = odbLogisticSteps;
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