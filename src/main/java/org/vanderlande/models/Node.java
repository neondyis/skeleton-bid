package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_NODES")
public class Node {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_EXT", nullable = false)
    private Long idExt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LSP_ID", nullable = false)
    private LogisticStep odbLogisticSteps;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STN_ID")
    private Station odbStations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LNK_ID")
    private HandlingAreaLink odbHandlingAreaLinks;

    @Column(name = "AREA_ID_REPORTING")
    private Long areaIdReporting;

    @Column(name = "ZONE_ID_REPORTING")
    private Long zoneIdReporting;

    @Column(name = "EQUIPMENT_ID_REPORTING")
    private Long equipmentIdReporting;

    public Long getEquipmentIdReporting() {
        return equipmentIdReporting;
    }

    public void setEquipmentIdReporting(Long equipmentIdReporting) {
        this.equipmentIdReporting = equipmentIdReporting;
    }

    public Long getZoneIdReporting() {
        return zoneIdReporting;
    }

    public void setZoneIdReporting(Long zoneIdReporting) {
        this.zoneIdReporting = zoneIdReporting;
    }

    public Long getAreaIdReporting() {
        return areaIdReporting;
    }

    public void setAreaIdReporting(Long areaIdReporting) {
        this.areaIdReporting = areaIdReporting;
    }

    public HandlingAreaLink getOdbHandlingAreaLinks() {
        return odbHandlingAreaLinks;
    }

    public void setOdbHandlingAreaLinks(HandlingAreaLink odbHandlingAreaLinks) {
        this.odbHandlingAreaLinks = odbHandlingAreaLinks;
    }

    public Station getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Station odbStations) {
        this.odbStations = odbStations;
    }

    public LogisticStep getOdbLogisticSteps() {
        return odbLogisticSteps;
    }

    public void setOdbLogisticSteps(LogisticStep odbLogisticSteps) {
        this.odbLogisticSteps = odbLogisticSteps;
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
}