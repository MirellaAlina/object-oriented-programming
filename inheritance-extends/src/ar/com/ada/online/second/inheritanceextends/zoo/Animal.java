package ar.com.ada.online.second.inheritanceextends.zoo;

import java.util.Objects;

public class Animal {
    private String breed;

    public Animal() {

    }

    public Animal(String breed) {
        this.breed = breed;
    }


    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal { breed ="
                + this.breed + " } ";
    }

    @Override
    public int hashCode() {
        return 10 * Objects.hash(breed);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Animal that = (Animal) obj;
        return breed.equals(that.breed);
    }
}

