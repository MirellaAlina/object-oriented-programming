package ar.com.ada.online.second.ipolymorphism.subclass;

import ar.com.ada.online.second.ipolymorphism.superclass.Vehicle;

import java.util.Objects;

public class SportsVehicle extends Vehicle {

    private Integer rpm;

    public SportsVehicle() {

    }

    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportsVehicle(String brand, String model, Integer year, Integer rpm) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rpm = rpm;
    }

    public Integer getRpm() {
        return this.rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public String technicalSheet() {
        String text;
        if (rpm >= 0 && rpm <= 50) {
            text = " El auto es muy bonito, pero sólo sirve para salir a pasear.";
        } else if (rpm >= 51 && rpm <= 300) {
            text = " Con este auto puedes desafiar a cualquiera en la pista";
        } else if (rpm >= 301 && rpm <= 600) {
            text = " Si tienes este auto, debes considerar participar en NASCAR";
        } else {
            text = " ¿Eres parte del elenco de rápidos y furiosos?";
        }
        return String.format("brand = "
                + brand +
                ", model = "
                + model +
                ", Year = "
                + year +
                ". " + text
        );
    }

    @Override
    public String toString() {
        return String.format("SportsVehicle { brand ="
                + this.brand +
                ", model ="
                + this.model +
                ", year ="
                + this.year +
                ", rpm ="
                + this.rpm +
                " }"
        );
    }

    @Override
    public int hashCode() {

        return 10 * Objects.hash(brand, model, year, rpm);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        SportsVehicle that = (SportsVehicle) obj;
        return super.equals(obj) &&
                rpm.equals(that.rpm);
    }
}
