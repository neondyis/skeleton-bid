package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_PHYSICAL_CLASSES")
public class PhysicalClass {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PDN_ID", nullable = false)
    private ProcessDefinition odbProcessDefinitions;

    @Column(name = "CLASSNAME", nullable = false, length = 7)
    private String classname;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
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