package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_PHYSICAL_BAGS")
public class PhysicalBag {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "LPC", length = 10)
    private String lpc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PAE_ID")
    private Package odbPackage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HAA_ID")
    private HandlingArea odbHandlingArea;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PCT_ID")
    private Product odbProduct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRS_ID")
    private Process odbProcess;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BSE_ID")
    private BagSource odbBagSource;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BSE_BDA_ID")
    private BagData odbBagData;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PPL_LOADED_ID")
    private ProcessPlan odbProcessPlan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PHE_ID")
    private Phase odbPhase;

    @Column(name = "IND_MULTIPLE_BAG_SOURCES", nullable = false)
    private Long indMultipleBagSources;

    @Column(name = "IND_DELETED_BAG_SOURCES", nullable = false)
    private Long indDeletedBagSources;

    @Column(name = "ROUTING_PROGRESS", length = 20)
    private String routingProgress;

    @Column(name = "PRODUCTION_PROGRESS", length = 26)
    private String productionProgress;

    @Column(name = "PRODUCTION_PROGRESS_NN", nullable = false, length = 26)
    private String productionProgressNn;

    @Column(name = "DATE_BAG_SOURCE_MODIFIED")
    private Instant dateBagSourceModified;

    @Column(name = "DATE_PROCESS_MODIFIED")
    private Instant dateProcessModified;

    @Column(name = "DATE_ROUTING_PROGRESS_MOD")
    private Instant dateRoutingProgressMod;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    @OneToMany(mappedBy = "odbPhysicalBags")
    private Set<PhaseAllocation> odbPhaseAllocations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbPhysicalBags")
    private Set<ProductAllocation> odbProductAllocations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbPhysicalBags")
    private Set<BagTraceEvent> odbBagTraceEvents = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbPhysicalBag")
    private Set<Package> odbPackages = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbPhysicalBag")
    private Set<BagSource> odbBagSources = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbPhysicalBags")
    private Set<LpnReport> odbLpnReports = new LinkedHashSet<>();

    public Set<LpnReport> getOdbLpnReports() {
        return odbLpnReports;
    }

    public void setOdbLpnReports(Set<LpnReport> odbLpnReports) {
        this.odbLpnReports = odbLpnReports;
    }

    public Set<BagSource> getOdbBagSources() {
        return odbBagSources;
    }

    public void setOdbBagSources(Set<BagSource> odbBagSources) {
        this.odbBagSources = odbBagSources;
    }

    public Set<Package> getOdbPackages() {
        return odbPackages;
    }

    public void setOdbPackages(Set<Package> odbPackages) {
        this.odbPackages = odbPackages;
    }

    public Set<BagTraceEvent> getOdbBagTraceEvents() {
        return odbBagTraceEvents;
    }

    public void setOdbBagTraceEvents(Set<BagTraceEvent> odbBagTraceEvents) {
        this.odbBagTraceEvents = odbBagTraceEvents;
    }

    public Set<ProductAllocation> getOdbProductAllocations() {
        return odbProductAllocations;
    }

    public void setOdbProductAllocations(Set<ProductAllocation> odbProductAllocations) {
        this.odbProductAllocations = odbProductAllocations;
    }

    public Set<PhaseAllocation> getOdbPhaseAllocations() {
        return odbPhaseAllocations;
    }

    public void setOdbPhaseAllocations(Set<PhaseAllocation> odbPhaseAllocations) {
        this.odbPhaseAllocations = odbPhaseAllocations;
    }

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public Instant getDateRoutingProgressMod() {
        return dateRoutingProgressMod;
    }

    public void setDateRoutingProgressMod(Instant dateRoutingProgressMod) {
        this.dateRoutingProgressMod = dateRoutingProgressMod;
    }

    public Instant getDateProcessModified() {
        return dateProcessModified;
    }

    public void setDateProcessModified(Instant dateProcessModified) {
        this.dateProcessModified = dateProcessModified;
    }

    public Instant getDateBagSourceModified() {
        return dateBagSourceModified;
    }

    public void setDateBagSourceModified(Instant dateBagSourceModified) {
        this.dateBagSourceModified = dateBagSourceModified;
    }

    public String getProductionProgressNn() {
        return productionProgressNn;
    }

    public void setProductionProgressNn(String productionProgressNn) {
        this.productionProgressNn = productionProgressNn;
    }

    public String getProductionProgress() {
        return productionProgress;
    }

    public void setProductionProgress(String productionProgress) {
        this.productionProgress = productionProgress;
    }

    public String getRoutingProgress() {
        return routingProgress;
    }

    public void setRoutingProgress(String routingProgress) {
        this.routingProgress = routingProgress;
    }

    public Long getIndDeletedBagSources() {
        return indDeletedBagSources;
    }

    public void setIndDeletedBagSources(Long indDeletedBagSources) {
        this.indDeletedBagSources = indDeletedBagSources;
    }

    public Long getIndMultipleBagSources() {
        return indMultipleBagSources;
    }

    public void setIndMultipleBagSources(Long indMultipleBagSources) {
        this.indMultipleBagSources = indMultipleBagSources;
    }

    public Phase getOdbPhase() {
        return odbPhase;
    }

    public void setOdbPhase(Phase odbPhases) {
        this.odbPhase = odbPhases;
    }

    public ProcessPlan getOdbProcessPlan() {
        return odbProcessPlan;
    }

    public void setOdbProcessPlan(ProcessPlan odbProcessPlans) {
        this.odbProcessPlan = odbProcessPlans;
    }

    public BagData getOdbBagData() {
        return odbBagData;
    }

    public void setOdbBagData(BagData odbBagDatas) {
        this.odbBagData = odbBagDatas;
    }

    public BagSource getOdbBagSource() {
        return odbBagSource;
    }

    public void setOdbBagSource(BagSource odbBagSources) {
        this.odbBagSource = odbBagSources;
    }

    public Process getOdbProcess() {
        return odbProcess;
    }

    public void setOdbProcess(Process odbProcesses) {
        this.odbProcess = odbProcesses;
    }

    public Product getOdbProduct() {
        return odbProduct;
    }

    public void setOdbProduct(Product odbProducts) {
        this.odbProduct = odbProducts;
    }

    public HandlingArea getOdbHandlingArea() {
        return odbHandlingArea;
    }

    public void setOdbHandlingArea(HandlingArea odbHandlingAreas) {
        this.odbHandlingArea = odbHandlingAreas;
    }

    public Package getOdbPackage() {
        return odbPackage;
    }

    public void setOdbPackage(Package odbPackages) {
        this.odbPackage = odbPackages;
    }

    public String getLpc() {
        return lpc;
    }

    public void setLpc(String lpc) {
        this.lpc = lpc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}