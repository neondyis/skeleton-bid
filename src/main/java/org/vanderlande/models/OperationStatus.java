package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ODB_OPERATION_STATUSES")
public class OperationStatus {
    @Id
    @Column(name = "PRS_ID", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRS_ID", nullable = false)
    private Process odbProcesses;

    @Column(name = "DATE_FIRST_BAG")
    private Instant dateFirstBag;

    @Column(name = "DATE_POTENTIAL_LAST_BAG")
    private Instant datePotentialLastBag;

    @Column(name = "DATE_NEW_BAG")
    private Instant dateNewBag;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public Instant getDateNewBag() {
        return dateNewBag;
    }

    public void setDateNewBag(Instant dateNewBag) {
        this.dateNewBag = dateNewBag;
    }

    public Instant getDatePotentialLastBag() {
        return datePotentialLastBag;
    }

    public void setDatePotentialLastBag(Instant datePotentialLastBag) {
        this.datePotentialLastBag = datePotentialLastBag;
    }

    public Instant getDateFirstBag() {
        return dateFirstBag;
    }

    public void setDateFirstBag(Instant dateFirstBag) {
        this.dateFirstBag = dateFirstBag;
    }

    public Process getOdbProcesses() {
        return odbProcesses;
    }

    public void setOdbProcesses(Process odbProcesses) {
        this.odbProcesses = odbProcesses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}