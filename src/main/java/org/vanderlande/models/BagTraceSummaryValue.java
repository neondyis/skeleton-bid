package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_BAG_TRACE_SUMMARY_VALUES")
public class BagTraceSummaryValue {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BTP_ID", nullable = false)
    private BagTraceSummaryGroup odbBagTraceSummaryGroups;

    @Column(name = "VALUE_ORDER", nullable = false)
    private Long valueOrder;

    @Column(name = "VALUE_IDENTIFIER", nullable = false, length = 32)
    private String valueIdentifier;

    @Column(name = "STRING_VALUE", length = 80)
    private String stringValue;

    @Column(name = "DATE_VALUE")
    private Instant dateValue;

    @Column(name = "INTEGER_VALUE")
    private Long integerValue;

    public Long getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(Long integerValue) {
        this.integerValue = integerValue;
    }

    public Instant getDateValue() {
        return dateValue;
    }

    public void setDateValue(Instant dateValue) {
        this.dateValue = dateValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getValueIdentifier() {
        return valueIdentifier;
    }

    public void setValueIdentifier(String valueIdentifier) {
        this.valueIdentifier = valueIdentifier;
    }

    public Long getValueOrder() {
        return valueOrder;
    }

    public void setValueOrder(Long valueOrder) {
        this.valueOrder = valueOrder;
    }

    public BagTraceSummaryGroup getOdbBagTraceSummaryGroups() {
        return odbBagTraceSummaryGroups;
    }

    public void setOdbBagTraceSummaryGroups(BagTraceSummaryGroup odbBagTraceSummaryGroups) {
        this.odbBagTraceSummaryGroups = odbBagTraceSummaryGroups;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}