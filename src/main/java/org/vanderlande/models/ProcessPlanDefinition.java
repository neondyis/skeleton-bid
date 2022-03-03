package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_PROCESS_PLAN_DEFINITIONS")
public class ProcessPlanDefinition {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HAA_ID", nullable = false)
    private HandlingArea odbHandlingAreas;

    @Column(name = "NAME", nullable = false, length = 64)
    private String name;

    @Column(name = "DISPLAY_NAME", nullable = false, length = 20)
    private String displayName;

    @Column(name = "IND_SYSTEM_PROCESS", nullable = false)
    private Long indSystemProcess;

    @OneToMany(mappedBy = "odbProcessPlanDefinitions")
    private Set<AlertConfiguration> odbAlertConfigurations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProcessPlanDefinitions")
    private Set<ProcessDefinition> odbProcessDefinitions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProcessPlanDefinitions")
    private Set<Family> odbFamilies = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbProcessPlanDefinitions")
    private Set<ProcessPlan> odbProcessPlans = new LinkedHashSet<>();

    public Set<ProcessPlan> getOdbProcessPlans() {
        return odbProcessPlans;
    }

    public void setOdbProcessPlans(Set<ProcessPlan> odbProcessPlans) {
        this.odbProcessPlans = odbProcessPlans;
    }

    public Set<Family> getOdbFamilies() {
        return odbFamilies;
    }

    public void setOdbFamilies(Set<Family> odbFamilies) {
        this.odbFamilies = odbFamilies;
    }

    public Set<ProcessDefinition> getOdbProcessDefinitions() {
        return odbProcessDefinitions;
    }

    public void setOdbProcessDefinitions(Set<ProcessDefinition> odbProcessDefinitions) {
        this.odbProcessDefinitions = odbProcessDefinitions;
    }

    public Set<AlertConfiguration> getOdbAlertConfigurations() {
        return odbAlertConfigurations;
    }

    public void setOdbAlertConfigurations(Set<AlertConfiguration> odbAlertConfigurations) {
        this.odbAlertConfigurations = odbAlertConfigurations;
    }

    public Long getIndSystemProcess() {
        return indSystemProcess;
    }

    public void setIndSystemProcess(Long indSystemProcess) {
        this.indSystemProcess = indSystemProcess;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}