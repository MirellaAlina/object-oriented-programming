package ar.com.ada.online.second.obj;

import java.util.Objects;

public class XWingStarfighter {
    private String model;
    private Integer maxAcceleration;

    public  XWingStarfighter() {}

    public XWingStarfighter(String model) {
        this.model = model;
    }
    public XWingStarfighter(Integer maxAcceleration) {
        this.maxAcceleration = maxAcceleration;
    }
    public XWingStarfighter(String model, Integer maxAcceleration) {
        this.model = model;
        this.maxAcceleration = maxAcceleration;
    }

    public void setMaxAcceleration(Integer maxAcceleration) {
        this.maxAcceleration = maxAcceleration;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMaxAcceleration() {
        return this.maxAcceleration;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return String.format("XWingStarfighter = { model = %s, maxAcceleration = %d }",
        this.model,
        this.maxAcceleration);
    }

    @Override
    public int hashCode() {
        return 10 * Objects.hash(this.model, this.maxAcceleration);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        XWingStarfighter that = (XWingStarfighter) obj;
        return this.model.equals(that.model) &&
                this.maxAcceleration.equals(that.maxAcceleration);
    }
}
