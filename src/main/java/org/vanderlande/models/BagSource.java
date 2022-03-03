package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_BAG_SOURCES")
public class BagSource {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "IND_CURRENT", nullable = false)
    private Long indCurrent;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PBG_ID", nullable = false)
    private PhysicalBag odbPhysicalBag;

    @Column(name = "DATE_CREATED", nullable = false)
    private Instant dateCreated;

    @Column(name = "OBJ_VERSION", nullable = false)
    private Long objVersion;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "odbBagSources")
    private BagData odbBagDatas;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "odbBagSources")
    private BagDataXml odbBagDataXml;

    @OneToMany(mappedBy = "odbBagSource")
    private Set<PhysicalBag> odbPhysicalBags = new LinkedHashSet<>();

    public Set<PhysicalBag> getOdbPhysicalBags() {
        return odbPhysicalBags;
    }

    public void setOdbPhysicalBags(Set<PhysicalBag> odbPhysicalBags) {
        this.odbPhysicalBags = odbPhysicalBags;
    }

    public BagDataXml getOdbBagDataXml() {
        return odbBagDataXml;
    }

    public void setOdbBagDataXml(BagDataXml odbBagDataXml) {
        this.odbBagDataXml = odbBagDataXml;
    }

    public BagData getOdbBagDatas() {
        return odbBagDatas;
    }

    public void setOdbBagDatas(BagData odbBagDatas) {
        this.odbBagDatas = odbBagDatas;
    }

    public Long getObjVersion() {
        return objVersion;
    }

    public void setObjVersion(Long objVersion) {
        this.objVersion = objVersion;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public PhysicalBag getOdbPhysicalBag() {
        return odbPhysicalBag;
    }

    public void setOdbPhysicalBag(PhysicalBag odbPhysicalBags) {
        this.odbPhysicalBag = odbPhysicalBags;
    }

    public Long getIndCurrent() {
        return indCurrent;
    }

    public void setIndCurrent(Long indCurrent) {
        this.indCurrent = indCurrent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}