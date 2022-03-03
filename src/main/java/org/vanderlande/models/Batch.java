package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_BATCHES")
public class Batch {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_EXT", nullable = false)
    private Long idExt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STN_ID", nullable = false)
    private Station odbStations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ULD_ID")
    private Uld odbUlds;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BTK_ID", nullable = false)
    private BatchTask odbBatchTasks;

    @Column(name = "STATE", length = 30)
    private String state;

    @Column(name = "ULD_PROCESS_LOCATION", length = 40)
    private String uldProcessLocation;

    @Column(name = "BATCH_EXCEPTION", length = 40)
    private String batchException;

    @Column(name = "DATE_EXPECTED_DELIVERY")
    private Instant dateExpectedDelivery;

    @Column(name = "DATE_MODIFIED", nullable = false)
    private Instant dateModified;

    @Column(name = "DATE_CREATED", nullable = false)
    private Instant dateCreated;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }

    public Instant getDateExpectedDelivery() {
        return dateExpectedDelivery;
    }

    public void setDateExpectedDelivery(Instant dateExpectedDelivery) {
        this.dateExpectedDelivery = dateExpectedDelivery;
    }

    public String getBatchException() {
        return batchException;
    }

    public void setBatchException(String batchException) {
        this.batchException = batchException;
    }

    public String getUldProcessLocation() {
        return uldProcessLocation;
    }

    public void setUldProcessLocation(String uldProcessLocation) {
        this.uldProcessLocation = uldProcessLocation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BatchTask getOdbBatchTasks() {
        return odbBatchTasks;
    }

    public void setOdbBatchTasks(BatchTask odbBatchTasks) {
        this.odbBatchTasks = odbBatchTasks;
    }

    public Uld getOdbUlds() {
        return odbUlds;
    }

    public void setOdbUlds(Uld odbUlds) {
        this.odbUlds = odbUlds;
    }

    public Station getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Station odbStations) {
        this.odbStations = odbStations;
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