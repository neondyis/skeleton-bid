package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_HANDLING_AREA_LINKS")
public class HandlingAreaLink {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_EXT", nullable = false, length = 10)
    private String idExt;

    @Column(name = "DESCRIPTION", nullable = false, length = 64)
    private String description;

    @Column(name = "MAXIMUM_PROCESSING_CAPACITY")
    private Long maximumProcessingCapacity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HAA_ID_START", nullable = false)
    private HandlingArea odbHandlingAreas;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HAA_ID_END", nullable = false)
    private HandlingArea odbHandlingAreas1;

    public HandlingArea getOdbHandlingAreas1() {
        return odbHandlingAreas1;
    }

    public void setOdbHandlingAreas1(HandlingArea odbHandlingAreas1) {
        this.odbHandlingAreas1 = odbHandlingAreas1;
    }

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public Long getMaximumProcessingCapacity() {
        return maximumProcessingCapacity;
    }

    public void setMaximumProcessingCapacity(Long maximumProcessingCapacity) {
        this.maximumProcessingCapacity = maximumProcessingCapacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdExt() {
        return idExt;
    }

    public void setIdExt(String idExt) {
        this.idExt = idExt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}