package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_CONFIGURATION_ITEMS")
public class ConfigurationItem {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HAA_ID", nullable = false)
    private HandlingArea odbHandlingAreas;

    @Column(name = "NAME", nullable = false, length = 25)
    private String name;

    @Lob
    @Column(name = "CONTENT")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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