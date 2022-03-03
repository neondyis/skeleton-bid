package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_HANDLERS")
public class Handler {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DESIGNATOR", nullable = false, length = 3)
    private String designator;

    @Column(name = "NAME", nullable = false, length = 64)
    private String name;

    @OneToMany(mappedBy = "odbHandlers")
    private Set<BagData> odbBagDatas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlers")
    private Set<ProcessPlan> odbProcessPlans = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbHandlers")
    private Set<UldTask> odbUldTasks = new LinkedHashSet<>();

    public Set<UldTask> getOdbUldTasks() {
        return odbUldTasks;
    }

    public void setOdbUldTasks(Set<UldTask> odbUldTasks) {
        this.odbUldTasks = odbUldTasks;
    }

    public Set<ProcessPlan> getOdbProcessPlans() {
        return odbProcessPlans;
    }

    public void setOdbProcessPlans(Set<ProcessPlan> odbProcessPlans) {
        this.odbProcessPlans = odbProcessPlans;
    }

    public Set<BagData> getOdbBagDatas() {
        return odbBagDatas;
    }

    public void setOdbBagDatas(Set<BagData> odbBagDatas) {
        this.odbBagDatas = odbBagDatas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignator() {
        return designator;
    }

    public void setDesignator(String designator) {
        this.designator = designator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}