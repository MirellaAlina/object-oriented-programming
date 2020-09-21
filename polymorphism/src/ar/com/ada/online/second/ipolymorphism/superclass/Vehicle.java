package ar.com.ada.online.second.ipolymorphism.superclass;

import java.util.Objects;

public class Vehicle {

    protected String brand;
    protected String model;
    protected Integer year;

    public Vehicle() {

    }

    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String technicalSheet() {
        return String.format("brand = "
                + brand +
                ", model = "
                + model +
                ", Year = "
                + year +
                ". Este vehículo no tiene categoría asignada"
        );
    }

    @Override
    public String toString() {
        return String.format("Vehicle { brand = "
                + this.brand +
                ", model = "
                + this.model +
                ", year = "
                + this.year + " }"
        );
    }

    @Override
    public int hashCode() {
        return 10 * Objects.hash(brand, model, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Vehicle that = (Vehicle) obj;
        return brand.equals(that.brand) &&
                model.equals(that.model) &&
                year.equals(that.year);
    }
}
