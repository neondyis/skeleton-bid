package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_STATION_TYPES")
public class StationType {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HAA_ID", nullable = false)
    private HandlingArea odbHandlingAreas;

    @Column(name = "NAME", nullable = false, length = 27)
    private String name;

    @Column(name = "TOPO_NAME", nullable = false, length = 27)
    private String topoName;

    @Column(name = "LATEST_RET_TIME_NORMAL_INTRVL", nullable = false)
    private Long latestRetTimeNormalIntrvl;

    @Column(name = "LATEST_RET_TIME_PRIO_INTRVL", nullable = false)
    private Long latestRetTimePrioIntrvl;

    @Column(name = "TARGET_RELEASE_RATE", nullable = false)
    private Long targetReleaseRate;

    @Column(name = "MAXIMUM_RELEASE_RATE", nullable = false)
    private Long maximumReleaseRate;

    public Long getMaximumReleaseRate() {
        return maximumReleaseRate;
    }

    public void setMaximumReleaseRate(Long maximumReleaseRate) {
        this.maximumReleaseRate = maximumReleaseRate;
    }

    public Long getTargetReleaseRate() {
        return targetReleaseRate;
    }

    public void setTargetReleaseRate(Long targetReleaseRate) {
        this.targetReleaseRate = targetReleaseRate;
    }

    public Long getLatestRetTimePrioIntrvl() {
        return latestRetTimePrioIntrvl;
    }

    public void setLatestRetTimePrioIntrvl(Long latestRetTimePrioIntrvl) {
        this.latestRetTimePrioIntrvl = latestRetTimePrioIntrvl;
    }

    public Long getLatestRetTimeNormalIntrvl() {
        return latestRetTimeNormalIntrvl;
    }

    public void setLatestRetTimeNormalIntrvl(Long latestRetTimeNormalIntrvl) {
        this.latestRetTimeNormalIntrvl = latestRetTimeNormalIntrvl;
    }

    public String getTopoName() {
        return topoName;
    }

    public void setTopoName(String topoName) {
        this.topoName = topoName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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