package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_BAG_DATA_EXCEPTION")
public class BagDataException {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 4)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BDA_ID")
    private BagData odbBagDatas;

    public BagData getOdbBagDatas() {
        return odbBagDatas;
    }

    public void setOdbBagDatas(BagData odbBagDatas) {
        this.odbBagDatas = odbBagDatas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}