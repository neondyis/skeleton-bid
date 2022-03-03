package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_BAG_DATA_XML")
public class BagDataXml {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BSE_ID", nullable = false)
    private BagSource odbBagSources;

    @Column(name = "MESSAGE", nullable = false)
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BagSource getOdbBagSources() {
        return odbBagSources;
    }

    public void setOdbBagSources(BagSource odbBagSources) {
        this.odbBagSources = odbBagSources;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}