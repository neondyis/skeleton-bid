package org.vanderlande.models;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_PROFILES")
public class Profile {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HAA_ID", nullable = false)
    private HandlingArea odbHandlingAreas;

    @Column(name = "NAME", nullable = false, length = 25)
    private String name;

    @Column(name = "DESCRIPTION", length = 500)
    private String description;

    @Column(name = "IND_ACTIVE", nullable = false)
    private Long indActive;

    @Column(name = "DATE_ACTIVATED")
    private Instant dateActivated;

    @Column(name = "DATE_MODIFIED", nullable = false)
    private Instant dateModified;

    @Column(name = "VERSION", length = 20)
    private String version;

    @Column(name = "LOCKED_BY_USER_ID", length = 100)
    private String lockedByUserId;

    @Column(name = "XML")
    private String xml;

    @OneToMany(mappedBy = "odbProfiles")
    private Set<AlertConfiguration> odbAlertConfigurations = new LinkedHashSet<>();

    public Set<AlertConfiguration> getOdbAlertConfigurations() {
        return odbAlertConfigurations;
    }

    public void setOdbAlertConfigurations(Set<AlertConfiguration> odbAlertConfigurations) {
        this.odbAlertConfigurations = odbAlertConfigurations;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getLockedByUserId() {
        return lockedByUserId;
    }

    public void setLockedByUserId(String lockedByUserId) {
        this.lockedByUserId = lockedByUserId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }

    public Instant getDateActivated() {
        return dateActivated;
    }

    public void setDateActivated(Instant dateActivated) {
        this.dateActivated = dateActivated;
    }

    public Long getIndActive() {
        return indActive;
    }

    public void setIndActive(Long indActive) {
        this.indActive = indActive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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