package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_STATION_BID_MESSAGES")
public class StationBidMessage {
    @EmbeddedId
    private StationBidMessageId id;

    @MapsId("stnId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STN_ID", nullable = false)
    private Station stn;

    @MapsId("bimId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BIM_ID", nullable = false)
    private BidMessage bim;

    public BidMessage getBim() {
        return bim;
    }

    public void setBim(BidMessage bim) {
        this.bim = bim;
    }

    public Station getStn() {
        return stn;
    }

    public void setStn(Station stn) {
        this.stn = stn;
    }

    public StationBidMessageId getId() {
        return id;
    }

    public void setId(StationBidMessageId id) {
        this.id = id;
    }
}