package org.vanderlande.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "ODB_SUBSCRIPTIONS")
public class Subscription {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "SUBSCRIBE_SESSION_ID", nullable = false)
    private Long subscribeSessionId;

    @Column(name = "STATE", nullable = false, length = 15)
    private String state;

    @Column(name = "DATE_CREATED", nullable = false)
    private Instant dateCreated;

    @Column(name = "DATE_MODIFIED", nullable = false)
    private Instant dateModified;

    @Column(name = "RESYNC_START_TIME", nullable = false)
    private Instant resyncStartTime;

    public Instant getResyncStartTime() {
        return resyncStartTime;
    }

    public void setResyncStartTime(Instant resyncStartTime) {
        this.resyncStartTime = resyncStartTime;
    }

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getSubscribeSessionId() {
        return subscribeSessionId;
    }

    public void setSubscribeSessionId(Long subscribeSessionId) {
        this.subscribeSessionId = subscribeSessionId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}