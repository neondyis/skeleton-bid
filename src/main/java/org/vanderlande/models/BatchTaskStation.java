package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_BATCH_TASK_STATIONS")
public class BatchTaskStation {
    @EmbeddedId
    private BatchTaskStationId id;

    @MapsId("stnId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STN_ID", nullable = false)
    private Station stn;

    @MapsId("btkId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BTK_ID", nullable = false)
    private BatchTask btk;

    public BatchTask getBtk() {
        return btk;
    }

    public void setBtk(BatchTask btk) {
        this.btk = btk;
    }

    public Station getStn() {
        return stn;
    }

    public void setStn(Station stn) {
        this.stn = stn;
    }

    public BatchTaskStationId getId() {
        return id;
    }

    public void setId(BatchTaskStationId id) {
        this.id = id;
    }
}