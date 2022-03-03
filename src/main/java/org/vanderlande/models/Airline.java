package org.vanderlande.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ODB_AIRLINES")
public class Airline {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DESIGNATOR", nullable = false, length = 3)
    private String designator;

    @Column(name = "NAME", length = 64)
    private String name;

    @Column(name = "BAGGAGE_TAG_ISSUER_CODE", length = 3)
    private String baggageTagIssuerCode;

    public String getBaggageTagIssuerCode() {
        return baggageTagIssuerCode;
    }

    public void setBaggageTagIssuerCode(String baggageTagIssuerCode) {
        this.baggageTagIssuerCode = baggageTagIssuerCode;
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