package ar.com.ada.online.second.inheritanceextends.zoo;

import java.util.Objects;

public class Horse extends Animal{
    private String name;
    private  Integer power;

    public Horse(){

    }
    public Horse(String breed, String name, Integer power){
        super(breed);
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return this.power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
    @Override
    public String toString() {
        return "Horse { name = "
                + this.name +
                ", power = "
                + this.power +
                ", breed = "
                + this.getBreed() +
                " } ";
    }

    @Override
    public int hashCode() {
        return 10 * Objects.hash(name, power, getBreed());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Horse that = (Horse) obj;
        return name.equals(that.name) &&
                power.equals(that.power) &&
                getBreed().equals(that.getBreed());
    }
}
