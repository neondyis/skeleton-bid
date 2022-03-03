package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_ULD_INSTANCES")
public class UldInstance {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UTK_ID")
    private UldTask odbUldTasks;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ULD_ID", nullable = false)
    private Uld odbUlds;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RST_ID")
    private RouteSegment odbRouteSegments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STN_LAST_ID")
    private Station odbStations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STN_ASSIGNED_ID")
    private Station odbStations1;

    @Column(name = "ULD_EXTENSION", nullable = false, length = 3)
    private String uldExtension;

    @Column(name = "ULD_IDENTIFICATION", nullable = false)
    private Long uldIdentification;

    @Column(name = "BUILD_STATUS", length = 8)
    private String buildStatus;

    @Column(name = "ROUTING_PROGRESS", length = 17)
    private String routingProgress;

    @Column(name = "PRODUCTION_PROGRESS", length = 26)
    private String productionProgress;

    @Column(name = "CONDENSED_BAGGAGE_STATUS", length = 20)
    private String condensedBaggageStatus;

    @Column(name = "CONDENSED_VERIFICATION_STATUS", length = 20)
    private String condensedVerificationStatus;

    @Column(name = "DATE_LOGISTICS_MODIFIED")
    private Instant dateLogisticsModified;

    @Column(name = "DATE_PROCESS_MODIFIED")
    private Instant dateProcessModified;

    @Column(name = "STATE", length = 8)
    private String state;

    @Column(name = "STORAGE_POSITION")
    private Long storagePosition;

    @Column(name = "TRAIN_ID")
    private Long trainId;

    @Column(name = "BAGGAGE_STATUS", nullable = false, length = 22)
    private String baggageStatus;

    @Column(name = "VERIFICATION_STATUS", nullable = false, length = 26)
    private String verificationStatus;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getBaggageStatus() {
        return baggageStatus;
    }

    public void setBaggageStatus(String baggageStatus) {
        this.baggageStatus = baggageStatus;
    }

    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }

    public Long getStoragePosition() {
        return storagePosition;
    }

    public void setStoragePosition(Long storagePosition) {
        this.storagePosition = storagePosition;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Instant getDateProcessModified() {
        return dateProcessModified;
    }

    public void setDateProcessModified(Instant dateProcessModified) {
        this.dateProcessModified = dateProcessModified;
    }

    public Instant getDateLogisticsModified() {
        return dateLogisticsModified;
    }

    public void setDateLogisticsModified(Instant dateLogisticsModified) {
        this.dateLogisticsModified = dateLogisticsModified;
    }

    public String getCondensedVerificationStatus() {
        return condensedVerificationStatus;
    }

    public void setCondensedVerificationStatus(String condensedVerificationStatus) {
        this.condensedVerificationStatus = condensedVerificationStatus;
    }

    public String getCondensedBaggageStatus() {
        return condensedBaggageStatus;
    }

    public void setCondensedBaggageStatus(String condensedBaggageStatus) {
        this.condensedBaggageStatus = condensedBaggageStatus;
    }

    public String getProductionProgress() {
        return productionProgress;
    }

    public void setProductionProgress(String productionProgress) {
        this.productionProgress = productionProgress;
    }

    public String getRoutingProgress() {
        return routingProgress;
    }

    public void setRoutingProgress(String routingProgress) {
        this.routingProgress = routingProgress;
    }

    public String getBuildStatus() {
        return buildStatus;
    }

    public void setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
    }

    public Long getUldIdentification() {
        return uldIdentification;
    }

    public void setUldIdentification(Long uldIdentification) {
        this.uldIdentification = uldIdentification;
    }

    public String getUldExtension() {
        return uldExtension;
    }

    public void setUldExtension(String uldExtension) {
        this.uldExtension = uldExtension;
    }

    public Station getOdbStations1() {
        return odbStations1;
    }

    public void setOdbStations1(Station odbStations1) {
        this.odbStations1 = odbStations1;
    }

    public Station getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Station odbStations) {
        this.odbStations = odbStations;
    }

    public RouteSegment getOdbRouteSegments() {
        return odbRouteSegments;
    }

    public void setOdbRouteSegments(RouteSegment odbRouteSegments) {
        this.odbRouteSegments = odbRouteSegments;
    }

    public Uld getOdbUlds() {
        return odbUlds;
    }

    public void setOdbUlds(Uld odbUlds) {
        this.odbUlds = odbUlds;
    }

    public UldTask getOdbUldTasks() {
        return odbUldTasks;
    }

    public void setOdbUldTasks(UldTask odbUldTasks) {
        this.odbUldTasks = odbUldTasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}