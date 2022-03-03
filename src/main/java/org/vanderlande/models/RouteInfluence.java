package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_ROUTE_INFLUENCES")
public class RouteInfluence {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_EXT", nullable = false)
    private Long idExt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HAA_ID", nullable = false)
    private HandlingArea odbHandlingAreas;

    @Column(name = "STATUS_CHANGE_TIME", nullable = false)
    private Instant statusChangeTime;

    @Column(name = "ACTIVE", nullable = false)
    private Long active;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public Long getActive() {
        return active;
    }

    public void setActive(Long active) {
        this.active = active;
    }

    public Instant getStatusChangeTime() {
        return statusChangeTime;
    }

    public void setStatusChangeTime(Instant statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
    }

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public Long getIdExt() {
        return idExt;
    }

    public void setIdExt(Long idExt) {
        this.idExt = idExt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}