package ar.com.ada.online.second.ipolymorphism.subclass;

import ar.com.ada.online.second.ipolymorphism.superclass.Vehicle;

import java.util.Objects;

public class Truck extends Vehicle {

    private Integer maxLoad;

    public Truck() {

    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, Integer year, Integer maxLoad) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxLoad = maxLoad;
    }

    public Integer getMaxLoad() {
        return this.maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public String technicalSheet() {
        String textTruck;
        if (maxLoad <= 100) {
            textTruck = "Para iniciar un negocio de flete, está muy bien este auto";
        } else {
            textTruck = "Tienes que usar este auto en el campo, es una máquina de trabajo!!";
        }
        return String.format("brand = "
                + brand +
                ", model = "
                + model +
                ", Year = "
                + year +
                ". " + textTruck
        );
    }

    @Override
    public String toString() {
        return String.format("Truck { brand ="
                + this.brand +
                ", model ="
                + this.model +
                ", year ="
                + this.year +
                ", maxLoad ="
                + this.maxLoad +
                " }"
        );
    }

    @Override
    public int hashCode() {

        return 10 * Objects.hash(brand, model, year, maxLoad);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Truck that = (Truck) obj;
        return super.equals(obj) &&
                maxLoad.equals(that.maxLoad);
    }
}
