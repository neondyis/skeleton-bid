package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_PHASE_DEFINITIONS")
public class PhaseDefinition {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PDN_ID", nullable = false)
    private ProcessDefinition odbProcessDefinitions;

    @Column(name = "NAME", nullable = false, length = 7)
    private String name;

    @OneToMany(mappedBy = "odbPhaseDefinitions")
    private Set<Phase> odbPhases = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbPhaseDefinitions")
    private Set<AllowedResource> odbAllowedResources = new LinkedHashSet<>();

    public Set<AllowedResource> getOdbAllowedResources() {
        return odbAllowedResources;
    }

    public void setOdbAllowedResources(Set<AllowedResource> odbAllowedResources) {
        this.odbAllowedResources = odbAllowedResources;
    }

    public Set<Phase> getOdbPhases() {
        return odbPhases;
    }

    public void setOdbPhases(Set<Phase> odbPhases) {
        this.odbPhases = odbPhases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProcessDefinition getOdbProcessDefinitions() {
        return odbProcessDefinitions;
    }

    public void setOdbProcessDefinitions(ProcessDefinition odbProcessDefinitions) {
        this.odbProcessDefinitions = odbProcessDefinitions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}