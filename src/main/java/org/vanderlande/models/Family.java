package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_FAMILIES")
public class Family {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PPN_ID", nullable = false)
    private ProcessPlanDefinition odbProcessPlanDefinitions;

    @Column(name = "NAME", nullable = false, length = 16)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProcessPlanDefinition getOdbProcessPlanDefinitions() {
        return odbProcessPlanDefinitions;
    }

    public void setOdbProcessPlanDefinitions(ProcessPlanDefinition odbProcessPlanDefinitions) {
        this.odbProcessPlanDefinitions = odbProcessPlanDefinitions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}