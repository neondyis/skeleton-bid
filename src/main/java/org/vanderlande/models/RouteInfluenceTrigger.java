package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_ROUTE_INFLUENCE_TRIGGERS")
public class RouteInfluenceTrigger {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RIN_ID", nullable = false)
    private RouteInfluence odbRouteInfluences;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SST_ID")
    private StatusSegment odbStatusSegments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HAS_ID")
    private HandlingAreaStatus odbHandlingAreaStatuses;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public HandlingAreaStatus getOdbHandlingAreaStatuses() {
        return odbHandlingAreaStatuses;
    }

    public void setOdbHandlingAreaStatuses(HandlingAreaStatus odbHandlingAreaStatuses) {
        this.odbHandlingAreaStatuses = odbHandlingAreaStatuses;
    }

    public StatusSegment getOdbStatusSegments() {
        return odbStatusSegments;
    }

    public void setOdbStatusSegments(StatusSegment odbStatusSegments) {
        this.odbStatusSegments = odbStatusSegments;
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