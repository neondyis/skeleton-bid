package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_BAG_DATA_SCREENING_INFOS")
public class BagDataScreeningInfo {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "SCREENING_PROCESS_ID", nullable = false)
    private Long screeningProcessId;

    @Column(name = "REQUIRED_SCREENING_LEVEL")
    private Long requiredScreeningLevel;

    @Column(name = "REACHED_SCREENING_LEVEL")
    private Long reachedScreeningLevel;

    @Column(name = "FAILED_SCREENING_LEVEL")
    private Long failedScreeningLevel;

    @Column(name = "SCREENING_STATE", length = 3)
    private String screeningState;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BDA_ID")
    private BagData odbBagDatas;

    public BagData getOdbBagDatas() {
        return odbBagDatas;
    }

    public void setOdbBagDatas(BagData odbBagDatas) {
        this.odbBagDatas = odbBagDatas;
    }

    public String getScreeningState() {
        return screeningState;
    }

    public void setScreeningState(String screeningState) {
        this.screeningState = screeningState;
    }

    public Long getFailedScreeningLevel() {
        return failedScreeningLevel;
    }

    public void setFailedScreeningLevel(Long failedScreeningLevel) {
        this.failedScreeningLevel = failedScreeningLevel;
    }

    public Long getReachedScreeningLevel() {
        return reachedScreeningLevel;
    }

    public void setReachedScreeningLevel(Long reachedScreeningLevel) {
        this.reachedScreeningLevel = reachedScreeningLevel;
    }

    public Long getRequiredScreeningLevel() {
        return requiredScreeningLevel;
    }

    public void setRequiredScreeningLevel(Long requiredScreeningLevel) {
        this.requiredScreeningLevel = requiredScreeningLevel;
    }

    public Long getScreeningProcessId() {
        return screeningProcessId;
    }

    public void setScreeningProcessId(Long screeningProcessId) {
        this.screeningProcessId = screeningProcessId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}