package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_ROUTE_SEGMENTS")
public class RouteSegment {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_EXT", nullable = false)
    private Long idExt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SST_ID", nullable = false)
    private StatusSegment odbStatusSegments;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NDE_ID_START", nullable = false)
    private Node odbNodes;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NDE_ID_END", nullable = false)
    private Node odbNodes1;

    @Column(name = "SYSTEM_CAPACITY")
    private Long systemCapacity;

    @OneToMany(mappedBy = "odbRouteSegments")
    private Set<UldInstance> odbUldInstances = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbRouteSegments")
    private Set<BagTraceEvent> odbBagTraceEvents = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbRouteSegments")
    private Set<Package> odbPackages = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbRouteSegments")
    private Set<RouteInfluenceUsage> odbRouteInfluenceUsages = new LinkedHashSet<>();

    public Set<RouteInfluenceUsage> getOdbRouteInfluenceUsages() {
        return odbRouteInfluenceUsages;
    }

    public void setOdbRouteInfluenceUsages(Set<RouteInfluenceUsage> odbRouteInfluenceUsages) {
        this.odbRouteInfluenceUsages = odbRouteInfluenceUsages;
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

    public Set<UldInstance> getOdbUldInstances() {
        return odbUldInstances;
    }

    public void setOdbUldInstances(Set<UldInstance> odbUldInstances) {
        this.odbUldInstances = odbUldInstances;
    }

    public Long getSystemCapacity() {
        return systemCapacity;
    }

    public void setSystemCapacity(Long systemCapacity) {
        this.systemCapacity = systemCapacity;
    }

    public Node getOdbNodes1() {
        return odbNodes1;
    }

    public void setOdbNodes1(Node odbNodes1) {
        this.odbNodes1 = odbNodes1;
    }

    public Node getOdbNodes() {
        return odbNodes;
    }

    public void setOdbNodes(Node odbNodes) {
        this.odbNodes = odbNodes;
    }

    public StatusSegment getOdbStatusSegments() {
        return odbStatusSegments;
    }

    public void setOdbStatusSegments(StatusSegment odbStatusSegments) {
        this.odbStatusSegments = odbStatusSegments;
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

    //TODO Reverse Engineering! Migrate other columns to the entity
}