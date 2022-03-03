package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_DISPLAY_BID_MESSAGES")
public class DisplayBidMessage {
    @EmbeddedId
    private DisplayBidMessageId id;

    @MapsId("dcsId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DCS_ID", nullable = false)
    private DisplayConfiguration dcs;

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

    public DisplayConfiguration getDcs() {
        return dcs;
    }

    public void setDcs(DisplayConfiguration dcs) {
        this.dcs = dcs;
    }

    public DisplayBidMessageId getId() {
        return id;
    }

    public void setId(DisplayBidMessageId id) {
        this.id = id;
    }
}