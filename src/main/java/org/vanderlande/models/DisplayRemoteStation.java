package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_DISPLAY_REMOTE_STATIONS")
public class DisplayRemoteStation {
    @EmbeddedId
    private DisplayRemoteStationId id;

    @MapsId("stnId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STN_ID", nullable = false)
    private Station stn;

    @MapsId("dcsId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DCS_ID", nullable = false)
    private DisplayConfiguration dcs;

    public DisplayConfiguration getDcs() {
        return dcs;
    }

    public void setDcs(DisplayConfiguration dcs) {
        this.dcs = dcs;
    }

    public Station getStn() {
        return stn;
    }

    public void setStn(Station stn) {
        this.stn = stn;
    }

    public DisplayRemoteStationId getId() {
        return id;
    }

    public void setId(DisplayRemoteStationId id) {
        this.id = id;
    }
}