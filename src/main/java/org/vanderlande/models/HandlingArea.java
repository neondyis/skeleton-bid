package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_HANDLING_AREAS")
public class HandlingArea {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_EXT", nullable = false, length = 7)
    private String idExt;

    @Column(name = "NAME", nullable = false, length = 7)
    private String name;

    @Column(name = "MAXIMUM_BAG_HOLDING_CAPACITY")
    private Long maximumBagHoldingCapacity;

    @Column(name = "MAXIMUM_ULD_HOLDING_CAPACITY")
    private Long maximumUldHoldingCapacity;

    @Column(name = "IND_LOCAL", nullable = false)
    private Long indLocal;

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<HandlingAreaStatus> odbHandlingAreaStatuses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<Profile> odbProfiles = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingArea")
    private Set<PhysicalBag> odbPhysicalBags = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<BatchTask> odbBatchTasks = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas1")
    private Set<FlowEvent> odbFlowEventsEntry = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<FlowEvent> odbFlowEventsExit = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<ResourceAllocation> odbResourceAllocations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<AssignedResource> odbAssignedResources = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<BagData> odbBagDatas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<ConfigurationItem> odbConfigurationItems = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<BagTraceEvent> odbBagTraceEvents = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<BidMessage> odbBidMessages = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<ProcessPlanDefinition> odbProcessPlanDefinitions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<DisplayConfiguration> odbDisplayConfigurations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas1")
    private Set<HandlingAreaLink> odbHandlingAreaLinksEnd = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<HandlingAreaLink> odbHandlingAreaLinksStart = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<Package> odbPackages = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<LogisticStep> odbLogisticSteps = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<StationType> odbStationTypes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<RouteInfluence> odbRouteInfluences = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<MetricSubjectInstance> odbMetricSubjectInstances = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<ProcessPlan> odbProcessPlans = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlingAreas")
    private Set<AllowedResource> odbAllowedResources = new LinkedHashSet<>();

    public Set<AllowedResource> getOdbAllowedResources() {
        return odbAllowedResources;
    }

    public void setOdbAllowedResources(Set<AllowedResource> odbAllowedResources) {
        this.odbAllowedResources = odbAllowedResources;
    }

    public Set<ProcessPlan> getOdbProcessPlans() {
        return odbProcessPlans;
    }

    public void setOdbProcessPlans(Set<ProcessPlan> odbProcessPlans) {
        this.odbProcessPlans = odbProcessPlans;
    }

    public Set<MetricSubjectInstance> getOdbMetricSubjectInstances() {
        return odbMetricSubjectInstances;
    }

    public void setOdbMetricSubjectInstances(Set<MetricSubjectInstance> odbMetricSubjectInstances) {
        this.odbMetricSubjectInstances = odbMetricSubjectInstances;
    }

    public Set<RouteInfluence> getOdbRouteInfluences() {
        return odbRouteInfluences;
    }

    public void setOdbRouteInfluences(Set<RouteInfluence> odbRouteInfluences) {
        this.odbRouteInfluences = odbRouteInfluences;
    }

    public Set<StationType> getOdbStationTypes() {
        return odbStationTypes;
    }

    public void setOdbStationTypes(Set<StationType> odbStationTypes) {
        this.odbStationTypes = odbStationTypes;
    }

    public Set<LogisticStep> getOdbLogisticSteps() {
        return odbLogisticSteps;
    }

    public void setOdbLogisticSteps(Set<LogisticStep> odbLogisticSteps) {
        this.odbLogisticSteps = odbLogisticSteps;
    }

    public Set<Package> getOdbPackages() {
        return odbPackages;
    }

    public void setOdbPackages(Set<Package> odbPackages) {
        this.odbPackages = odbPackages;
    }

    public Set<HandlingAreaLink> getOdbHandlingAreaLinksStart() {
        return odbHandlingAreaLinksStart;
    }

    public void setOdbHandlingAreaLinksStart(Set<HandlingAreaLink> odbHandlingAreaLinksStart) {
        this.odbHandlingAreaLinksStart = odbHandlingAreaLinksStart;
    }

    public Set<HandlingAreaLink> getOdbHandlingAreaLinksEnd() {
        return odbHandlingAreaLinksEnd;
    }

    public void setOdbHandlingAreaLinksEnd(Set<HandlingAreaLink> odbHandlingAreaLinksEnd) {
        this.odbHandlingAreaLinksEnd = odbHandlingAreaLinksEnd;
    }

    public Set<DisplayConfiguration> getOdbDisplayConfigurations() {
        return odbDisplayConfigurations;
    }

    public void setOdbDisplayConfigurations(Set<DisplayConfiguration> odbDisplayConfigurations) {
        this.odbDisplayConfigurations = odbDisplayConfigurations;
    }

    public Set<ProcessPlanDefinition> getOdbProcessPlanDefinitions() {
        return odbProcessPlanDefinitions;
    }

    public void setOdbProcessPlanDefinitions(Set<ProcessPlanDefinition> odbProcessPlanDefinitions) {
        this.odbProcessPlanDefinitions = odbProcessPlanDefinitions;
    }

    public Set<BidMessage> getOdbBidMessages() {
        return odbBidMessages;
    }

    public void setOdbBidMessages(Set<BidMessage> odbBidMessages) {
        this.odbBidMessages = odbBidMessages;
    }

    public Set<BagTraceEvent> getOdbBagTraceEvents() {
        return odbBagTraceEvents;
    }

    public void setOdbBagTraceEvents(Set<BagTraceEvent> odbBagTraceEvents) {
        this.odbBagTraceEvents = odbBagTraceEvents;
    }

    public Set<ConfigurationItem> getOdbConfigurationItems() {
        return odbConfigurationItems;
    }

    public void setOdbConfigurationItems(Set<ConfigurationItem> odbConfigurationItems) {
        this.odbConfigurationItems = odbConfigurationItems;
    }

    public Set<BagData> getOdbBagDatas() {
        return odbBagDatas;
    }

    public void setOdbBagDatas(Set<BagData> odbBagDatas) {
        this.odbBagDatas = odbBagDatas;
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

    public Set<FlowEvent> getOdbFlowEventsExit() {
        return odbFlowEventsExit;
    }

    public void setOdbFlowEventsExit(Set<FlowEvent> odbFlowEventsExit) {
        this.odbFlowEventsExit = odbFlowEventsExit;
    }

    public Set<FlowEvent> getOdbFlowEventsEntry() {
        return odbFlowEventsEntry;
    }

    public void setOdbFlowEventsEntry(Set<FlowEvent> odbFlowEventsEntry) {
        this.odbFlowEventsEntry = odbFlowEventsEntry;
    }

    public Set<BatchTask> getOdbBatchTasks() {
        return odbBatchTasks;
    }

    public void setOdbBatchTasks(Set<BatchTask> odbBatchTasks) {
        this.odbBatchTasks = odbBatchTasks;
    }

    public Set<PhysicalBag> getOdbPhysicalBags() {
        return odbPhysicalBags;
    }

    public void setOdbPhysicalBags(Set<PhysicalBag> odbPhysicalBags) {
        this.odbPhysicalBags = odbPhysicalBags;
    }

    public Set<Profile> getOdbProfiles() {
        return odbProfiles;
    }

    public void setOdbProfiles(Set<Profile> odbProfiles) {
        this.odbProfiles = odbProfiles;
    }

    public Set<HandlingAreaStatus> getOdbHandlingAreaStatuses() {
        return odbHandlingAreaStatuses;
    }

    public void setOdbHandlingAreaStatuses(Set<HandlingAreaStatus> odbHandlingAreaStatuses) {
        this.odbHandlingAreaStatuses = odbHandlingAreaStatuses;
    }

    public Long getIndLocal() {
        return indLocal;
    }

    public void setIndLocal(Long indLocal) {
        this.indLocal = indLocal;
    }

    public Long getMaximumUldHoldingCapacity() {
        return maximumUldHoldingCapacity;
    }

    public void setMaximumUldHoldingCapacity(Long maximumUldHoldingCapacity) {
        this.maximumUldHoldingCapacity = maximumUldHoldingCapacity;
    }

    public Long getMaximumBagHoldingCapacity() {
        return maximumBagHoldingCapacity;
    }

    public void setMaximumBagHoldingCapacity(Long maximumBagHoldingCapacity) {
        this.maximumBagHoldingCapacity = maximumBagHoldingCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdExt() {
        return idExt;
    }

    public void setIdExt(String idExt) {
        this.idExt = idExt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}