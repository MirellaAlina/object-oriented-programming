package ar.com.ada.online.second.ipolymorphism.subclass;

import ar.com.ada.online.second.ipolymorphism.superclass.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {

    private Integer potency;

    public ElectricalVehicle() {

    }

    public ElectricalVehicle(Integer potency) {

        this.potency = potency;
    }

    public ElectricalVehicle(String brand, String model, Integer year, Integer potency) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.potency = potency;
    }

    public Integer getPotency() {
        return this.potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    public String technicalSheet() {
        if (year < 2007) {
            return String.format("brand = "
                    + brand +
                    ", model = "
                    + model +
                    ", Year = "
                    + year +
                    " No existe modelo para este año");
        } else {
            return String.format("brand = "
                    + brand +
                    ", model = "
                    + model +
                    ", Year = "
                    + year +
                    ". Es un auto de última tecnología!");
        }
    }


    @Override
    public String toString() {
        return String.format("ElectricalVehicle { brand ="
                + this.brand +
                ", model ="
                + this.model +
                ", year ="
                + this.year +
                ", potency ="
                + this.potency + " }"
        );
    }

    @Override
    public int hashCode() {

        return 10 * Objects.hash(brand, model, year, potency);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        ElectricalVehicle that = (ElectricalVehicle) obj;
        return brand.equals(that.brand) &&
                model.equals(that.model) &&
                year.equals(that.year) &&
                potency.equals(that.potency);
    }

}
