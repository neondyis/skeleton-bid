package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_FLOW_EVENTS")
public class FlowEvent {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DATE_EVENT", nullable = false)
    private Instant dateEvent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SST_ID_EXIT")
    private StatusSegment odbStatusSegments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LSP_ID_EXIT")
    private LogisticStep odbLogisticSteps;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HAA_ID_EXIT")
    private HandlingArea odbHandlingAreas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SST_ID_ENTRY")
    private StatusSegment odbStatusSegments1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LSP_ID_ENTRY")
    private LogisticStep odbLogisticSteps1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HAA_ID_ENTRY")
    private HandlingArea odbHandlingAreas1;

    public HandlingArea getOdbHandlingAreas1() {
        return odbHandlingAreas1;
    }

    public void setOdbHandlingAreas1(HandlingArea odbHandlingAreas1) {
        this.odbHandlingAreas1 = odbHandlingAreas1;
    }

    public LogisticStep getOdbLogisticSteps1() {
        return odbLogisticSteps1;
    }

    public void setOdbLogisticSteps1(LogisticStep odbLogisticSteps1) {
        this.odbLogisticSteps1 = odbLogisticSteps1;
    }

    public StatusSegment getOdbStatusSegments1() {
        return odbStatusSegments1;
    }

    public void setOdbStatusSegments1(StatusSegment odbStatusSegments1) {
        this.odbStatusSegments1 = odbStatusSegments1;
    }

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public LogisticStep getOdbLogisticSteps() {
        return odbLogisticSteps;
    }

    public void setOdbLogisticSteps(LogisticStep odbLogisticSteps) {
        this.odbLogisticSteps = odbLogisticSteps;
    }

    public StatusSegment getOdbStatusSegments() {
        return odbStatusSegments;
    }

    public void setOdbStatusSegments(StatusSegment odbStatusSegments) {
        this.odbStatusSegments = odbStatusSegments;
    }

    public Instant getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(Instant dateEvent) {
        this.dateEvent = dateEvent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}