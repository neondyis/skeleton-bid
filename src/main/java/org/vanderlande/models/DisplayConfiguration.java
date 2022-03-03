package org.vanderlande.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ODB_DISPLAY_CONFIGURATIONS")
public class DisplayConfiguration {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_EXT", nullable = false)
    private Long idExt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HAA_ID", nullable = false)
    private HandlingArea odbHandlingAreas;

    @Column(name = "DISPLAY_NAME", length = 64)
    private String displayName;

    @Column(name = "DESCRIPTION", length = 64)
    private String description;

    @Column(name = "IND_SUPPORT_FREE_TEXT", nullable = false)
    private Long indSupportFreeText;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STN_ID")
    private Station odbStation;

    @ManyToMany
    @JoinTable(name = "ODB_DISPLAY_REMOTE_STATIONS",
            joinColumns = @JoinColumn(name = "DCS_ID"),
            inverseJoinColumns = @JoinColumn(name = "STN_ID"))
    private Set<Station> odbStations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "odbDisplayConfigurations")
    private Set<BidConfig> odbBidConfigs = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "ODB_DISPLAY_BID_MESSAGES",
            joinColumns = @JoinColumn(name = "DCS_ID"),
            inverseJoinColumns = @JoinColumn(name = "BIM_ID"))
    private Set<BidMessage> odbBidMessages = new LinkedHashSet<>();

    public Set<BidMessage> getOdbBidMessages() {
        return odbBidMessages;
    }

    public void setOdbBidMessages(Set<BidMessage> odbBidMessages) {
        this.odbBidMessages = odbBidMessages;
    }

    public Set<BidConfig> getOdbBidConfigs() {
        return odbBidConfigs;
    }

    public void setOdbBidConfigs(Set<BidConfig> odbBidConfigs) {
        this.odbBidConfigs = odbBidConfigs;
    }

    public Set<Station> getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Set<Station> odbStations) {
        this.odbStations = odbStations;
    }

    public Station getOdbStation() {
        return odbStation;
    }

    public void setOdbStation(Station odbStations) {
        this.odbStation = odbStations;
    }

    public Long getIndSupportFreeText() {
        return indSupportFreeText;
    }

    public void setIndSupportFreeText(Long indSupportFreeText) {
        this.indSupportFreeText = indSupportFreeText;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public HandlingArea getOdbHandlingAreas() {
        return odbHandlingAreas;
    }

    public void setOdbHandlingAreas(HandlingArea odbHandlingAreas) {
        this.odbHandlingAreas = odbHandlingAreas;
    }

    public Long getIdExt() {
        return idExt;
    }

    public void setIdExt(Long idExt) {
        this.idExt = idExt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}