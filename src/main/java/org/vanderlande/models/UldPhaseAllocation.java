package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_ULD_PHASE_ALLOCATIONS")
public class UldPhaseAllocation {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PHE_ID", nullable = false)
    private Phase odbPhases;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UIN_ID", nullable = false)
    private UldInstance odbUldInstances;

    @Column(name = "ASSIGNMENT_STATUS", nullable = false, length = 8)
    private String assignmentStatus;

    public String getAssignmentStatus() {
        return assignmentStatus;
    }

    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    public UldInstance getOdbUldInstances() {
        return odbUldInstances;
    }

    public void setOdbUldInstances(UldInstance odbUldInstances) {
        this.odbUldInstances = odbUldInstances;
    }

    public Phase getOdbPhases() {
        return odbPhases;
    }

    public void setOdbPhases(Phase odbPhases) {
        this.odbPhases = odbPhases;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}