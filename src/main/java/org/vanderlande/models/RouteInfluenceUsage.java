package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_ROUTE_INFLUENCE_USAGES")
public class RouteInfluenceUsage {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RIN_ID", nullable = false)
    private RouteInfluence odbRouteInfluences;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RST_ID", nullable = false)
    private RouteSegment odbRouteSegments;

    public RouteSegment getOdbRouteSegments() {
        return odbRouteSegments;
    }

    public void setOdbRouteSegments(RouteSegment odbRouteSegments) {
        this.odbRouteSegments = odbRouteSegments;
    }

    public RouteInfluence getOdbRouteInfluences() {
        return odbRouteInfluences;
    }

    public void setOdbRouteInfluences(RouteInfluence odbRouteInfluences) {
        this.odbRouteInfluences = odbRouteInfluences;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}