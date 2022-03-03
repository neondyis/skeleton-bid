package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_ULD_TYPES")
public class UldType {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 3)
    private String name;

    @OneToMany(mappedBy = "odbUldTypes")
    private Set<UldCategory> odbUldCategories = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbUldTypes")
    private Set<Uld> odbUlds = new LinkedHashSet<>();

    public Set<Uld> getOdbUlds() {
        return odbUlds;
    }

    public void setOdbUlds(Set<Uld> odbUlds) {
        this.odbUlds = odbUlds;
    }

    public Set<UldCategory> getOdbUldCategories() {
        return odbUldCategories;
    }

    public void setOdbUldCategories(Set<UldCategory> odbUldCategories) {
        this.odbUldCategories = odbUldCategories;
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