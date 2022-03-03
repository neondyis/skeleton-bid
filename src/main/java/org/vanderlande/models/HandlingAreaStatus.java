package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_HANDLING_AREA_STATUSES")
public class HandlingAreaStatus {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LNK_ID", nullable = false)
    private HandlingAreaLink odbHandlingAreaLinks;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HAA_ID", nullable = false)
    private HandlingArea odbHandlingAreas;

    @Column(name = "STATUS", nullable = false, length = 13)
    private String status;

    @Column(name = "DATE_MODIFIED", nullable = false)
    private Instant dateModified;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public HandlingAreaLink getOdbHandlingAreaLinks() {
        return odbHandlingAreaLinks;
    }

    public void setOdbHandlingAreaLinks(HandlingAreaLink odbHandlingAreaLinks) {
        this.odbHandlingAreaLinks = odbHandlingAreaLinks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}