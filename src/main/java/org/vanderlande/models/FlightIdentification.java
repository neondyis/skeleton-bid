package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_FLIGHT_IDENTIFICATIONS")
public class FlightIdentification {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "AIRLINE", nullable = false, length = 3)
    private String airline;

    @Column(name = "FLIGHT_NUMBER", nullable = false, length = 5)
    private String flightNumber;

    @Column(name = "IDENTIFICATION_TYPE", nullable = false, length = 10)
    private String identificationType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PPL_ID", nullable = false)
    private ProcessPlan odbProcessPlans;

    public ProcessPlan getOdbProcessPlans() {
        return odbProcessPlans;
    }

    public void setOdbProcessPlans(ProcessPlan odbProcessPlans) {
        this.odbProcessPlans = odbProcessPlans;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}