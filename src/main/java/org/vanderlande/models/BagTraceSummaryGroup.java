package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_BAG_TRACE_SUMMARY_GROUPS")
public class BagTraceSummaryGroup {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BTT_ID", nullable = false)
    private BagTraceEvent odbBagTraceEvents;

    @Column(name = "GROUP_NAME", nullable = false, length = 21)
    private String groupName;

    @Column(name = "GROUP_NUMBER", nullable = false)
    private Long groupNumber;

    public Long getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Long groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public BagTraceEvent getOdbBagTraceEvents() {
        return odbBagTraceEvents;
    }

    public void setOdbBagTraceEvents(BagTraceEvent odbBagTraceEvents) {
        this.odbBagTraceEvents = odbBagTraceEvents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}