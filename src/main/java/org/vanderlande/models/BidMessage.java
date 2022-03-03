package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_BID_MESSAGES")
public class BidMessage {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DATE_MODIFIED", nullable = false)
    private Instant dateModified;

    @Column(name = "EXPIRATION", nullable = false)
    private Instant expiration;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HAA_ID", nullable = false)
    private HandlingArea odbHandlingAreas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PPL_ID")
    private ProcessPlan odbProcessPlans;

    @Column(name = "MESSAGE_TEXT", nullable = false, length = 80)
    private String messageText;

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public ProcessPlan getOdbProcessPlans() {
        return odbProcessPlans;
    }

    public void setOdbProcessPlans(ProcessPlan odbProcessPlans) {
        this.odbProcessPlans = odbProcessPlans;
    }

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public Instant getExpiration() {
        return expiration;
    }

    public void setExpiration(Instant expiration) {
        this.expiration = expiration;
    }

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}