package org.vanderlande.models;

import javax.persistence.*;

@Entity
@Table(name = "ODB_ULD_CATEGORY_ACTIVITIES")
public class UldCategoryActivity {
    @EmbeddedId
    private UldCategoryActivityId id;

    @MapsId("ulcId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ULC_ID", nullable = false)
    private UldCategory ulc;

    @MapsId("acyId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACY_ID", nullable = false)
    private Activity acy;

    public Activity getAcy() {
        return acy;
    }

    public void setAcy(Activity acy) {
        this.acy = acy;
    }

    public UldCategory getUlc() {
        return ulc;
    }

    public void setUlc(UldCategory ulc) {
        this.ulc = ulc;
    }

    public UldCategoryActivityId getId() {
        return id;
    }

    public void setId(UldCategoryActivityId id) {
        this.id = id;
    }
}