package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_STATUS_SEGMENT_STATUSES")
public class StatusSegmentStatus {
    @Id
    @Column(name = "SST_ID", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SST_ID", nullable = false)
    private StatusSegment odbStatusSegments;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SSM_ID", nullable = false)
    private StatusSegmentStatusDom odbStatusSegmentStatusDom;

    @Column(name = "DATE_MODIFIED", nullable = false)
    private Instant dateModified;

    @Column(name = "DATE_EVENT", nullable = false)
    private Instant dateEvent;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public Instant getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(Instant dateEvent) {
        this.dateEvent = dateEvent;
    }

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }

    public StatusSegmentStatusDom getOdbStatusSegmentStatusDom() {
        return odbStatusSegmentStatusDom;
    }

    public void setOdbStatusSegmentStatusDom(StatusSegmentStatusDom odbStatusSegmentStatusDom) {
        this.odbStatusSegmentStatusDom = odbStatusSegmentStatusDom;
    }

    public StatusSegment getOdbStatusSegments() {
        return odbStatusSegments;
    }

    public void setOdbStatusSegments(StatusSegment odbStatusSegments) {
        this.odbStatusSegments = odbStatusSegments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}