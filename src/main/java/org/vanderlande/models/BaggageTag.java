package org.vanderlande.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ODB_BAGGAGE_TAGS")
public class BaggageTag implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BAG_DATA_ID", nullable = false)
    @Id
    private BagData bagData;

    @Column(name = "LPC", length = 10)
    private String lpc;

    @Column(name = "LPC_EXTENSION")
    private Integer lpcExtension;

    public Integer getLpcExtension() {
        return lpcExtension;
    }

    public void setLpcExtension(Integer lpcExtension) {
        this.lpcExtension = lpcExtension;
    }

    public String getLpc() {
        return lpc;
    }

    public void setLpc(String lpc) {
        this.lpc = lpc;
    }

    public BagData getBagData() {
        return bagData;
    }

    public void setBagData(BagData bagData) {
        this.bagData = bagData;
    }
}