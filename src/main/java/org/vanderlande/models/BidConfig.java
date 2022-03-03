package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_BID_CONFIG")
public class BidConfig {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DISPLAY_CONFIG_ID")
    private DisplayConfiguration odbDisplayConfigurations;

    @Column(name = "PRIMARY_TABLE_COLOUR", length = 10)
    private String primaryTableColour;

    @Column(name = "ACCENT_TABLE_COLOUR", length = 10)
    private String accentTableColour;

    @Column(name = "BACKGROUND_COLOUR", length = 10)
    private String backgroundColour;

    @Column(name = "TEXT_COLOUR", length = 10)
    private String textColour;

    @Column(name = "MESSAGE_COLOUR", length = 10)
    private String messageColour;

    @Column(name = "TABLE_STYLE", length = 300)
    private String tableStyle;

    @Column(name = "TABLE_LAYOUT", length = 4000)
    private String tableLayout;

    @Column(name = "QUERY", length = 4000)
    private String query;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STN_ID")
    private Station odbStations;

    public Station getOdbStations() {
        return odbStations;
    }

    public void setOdbStations(Station odbStations) {
        this.odbStations = odbStations;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getTableLayout() {
        return tableLayout;
    }

    public void setTableLayout(String tableLayout) {
        this.tableLayout = tableLayout;
    }

    public String getTableStyle() {
        return tableStyle;
    }

    public void setTableStyle(String tableStyle) {
        this.tableStyle = tableStyle;
    }

    public String getMessageColour() {
        return messageColour;
    }

    public void setMessageColour(String messageColour) {
        this.messageColour = messageColour;
    }

    public String getTextColour() {
        return textColour;
    }

    public void setTextColour(String textColour) {
        this.textColour = textColour;
    }

    public String getBackgroundColour() {
        return backgroundColour;
    }

    public void setBackgroundColour(String backgroundColour) {
        this.backgroundColour = backgroundColour;
    }

    public String getAccentTableColour() {
        return accentTableColour;
    }

    public void setAccentTableColour(String accentTableColour) {
        this.accentTableColour = accentTableColour;
    }

    public String getPrimaryTableColour() {
        return primaryTableColour;
    }

    public void setPrimaryTableColour(String primaryTableColour) {
        this.primaryTableColour = primaryTableColour;
    }

    public DisplayConfiguration getOdbDisplayConfigurations() {
        return odbDisplayConfigurations;
    }

    public void setOdbDisplayConfigurations(DisplayConfiguration odbDisplayConfigurations) {
        this.odbDisplayConfigurations = odbDisplayConfigurations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}