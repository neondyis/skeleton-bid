package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_ULD_TASK_ULDS")
public class UldTaskUld {
    @EmbeddedId
    private UldTaskUldId id;

    @MapsId("uldId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ULD_ID", nullable = false)
    private Uld uld;

    @MapsId("utkId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UTK_ID", nullable = false)
    private UldTask utk;

    public UldTask getUtk() {
        return utk;
    }

    public void setUtk(UldTask utk) {
        this.utk = utk;
    }

    public Uld getUld() {
        return uld;
    }

    public void setUld(Uld uld) {
        this.uld = uld;
    }

    public UldTaskUldId getId() {
        return id;
    }

    public void setId(UldTaskUldId id) {
        this.id = id;
    }
}