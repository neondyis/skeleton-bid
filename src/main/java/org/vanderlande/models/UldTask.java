package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_ULD_TASKS")
public class UldTask {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STN_ID", nullable = false)
    private Station odbStations;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HLR_ID", nullable = false)
    private Handler odbHandlers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PPL_ID")
    private ProcessPlan odbProcessPlans;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PCT_ID")
    private Product odbProducts;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ULC_ID")
    private UldCategory odbUldCategories;

    @Column(name = "DATE_MODIFIED", nullable = false)
    private Instant dateModified;

    @Column(name = "TEXT", length = 59)
    private String text;

    @Column(name = "IND_MANUAL", nullable = false)
    private Long indManual;

    @Column(name = "REQUEST_TYPE", nullable = false, length = 30)
    private String requestType;

    @Column(name = "STATE", nullable = false, length = 15)
    private String state;

    @Column(name = "NR_OF_ULDS_REQUESTED")
    private Long nrOfUldsRequested;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public Long getNrOfUldsRequested() {
        return nrOfUldsRequested;
    }

    public void setNrOfUldsRequested(Long nrOfUldsRequested) {
        this.nrOfUldsRequested = nrOfUldsRequested;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public Long getIndManual() {
        return indManual;
    }

    public void setIndManual(Long indManual) {
        this.indManual = indManual;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }

    public UldCategory getOdbUldCategories() {
        return odbUldCategories;
    }

    public void setOdbUldCategories(UldCategory odbUldCategories) {
        this.odbUldCategories = odbUldCategories;
    }

    public Product getOdbProducts() {
        return odbProducts;
    }

    public void setOdbProducts(Product odbProducts) {
        this.odbProducts = odbProducts;
    }

    public ProcessPlan getOdbProcessPlans() {
        return odbProcessPlans;
    }

    public void setOdbProcessPlans(ProcessPlan odbProcessPlans) {
        this.odbProcessPlans = odbProcessPlans;
    }

    public Handler getOdbHandlers() {
        return odbHandlers;
    }

    public void setOdbHandlers(Handler odbHandlers) {
        this.odbHandlers = odbHandlers;
    }

    public Station getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Station odbStations) {
        this.odbStations = odbStations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}