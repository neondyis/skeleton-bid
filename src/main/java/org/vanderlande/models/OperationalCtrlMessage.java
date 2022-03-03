package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_OPERATIONAL_CTRL_MESSAGES")
public class OperationalCtrlMessage {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DATE_CREATED", nullable = false)
    private Instant dateCreated;

    @Column(name = "TEXT", nullable = false, length = 59)
    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PAE_ID")
    private Package odbPackages;

    public Package getOdbPackages() {
        return odbPackages;
    }

    public void setOdbPackages(Package odbPackages) {
        this.odbPackages = odbPackages;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}