package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_STORAGE_LOCATIONS")
public class StorageLocation {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_EXT", nullable = false)
    private Long idExt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STN_ID", nullable = false)
    private Station odbStations;

    @Column(name = "DESCRIPTION", nullable = false, length = 25)
    private String description;

    @OneToMany(mappedBy = "odbStorageLocations")
    private Set<BagData> odbBagDatas = new LinkedHashSet<>();

    public Set<BagData> getOdbBagDatas() {
        return odbBagDatas;
    }

    public void setOdbBagDatas(Set<BagData> odbBagDatas) {
        this.odbBagDatas = odbBagDatas;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Station getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Station odbStations) {
        this.odbStations = odbStations;
    }

    public Long getIdExt() {
        return idExt;
    }

    public void setIdExt(Long idExt) {
        this.idExt = idExt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}