package ar.com.ada.online.second.inheritanceextends;

import ar.com.ada.online.second.inheritanceextends.zoo.Animal;
import ar.com.ada.online.second.inheritanceextends.zoo.Dog;
import ar.com.ada.online.second.inheritanceextends.zoo.Horse;

public class Main {

    public static void main(String[] args) {
        Dog dogOne = new Dog("Caniche", 4, 4);
        Dog dogTwo = new Dog("Labrador", 4, 7);

        Horse horseOne = new Horse("Lipizzano", "Caballin", 150);
        Horse horseTwo = new Horse("Lipizzano", "Caballin", 150);

        System.out.println("dogOne.toString(): " + dogOne.toString());
        System.out.println("dogTwo.toString(): " + dogTwo.toString());
        System.out.println("dogOne.hashCode(): " + dogOne.hashCode());
        System.out.println("dogTwo.hashCode(): " + dogTwo.hashCode());
        System.out.println("dogOne.equals(dogTwo): " + dogOne.equals(dogTwo));

        System.out.println("horseOne.toString(): " + horseOne.toString());
        System.out.println("horseTwo.toString(): " + horseTwo.toString());
        System.out.println("horseOne.hashCode(): " + horseOne.hashCode());
        System.out.println("horseTwo.hashCode(): " + horseTwo.hashCode());
        System.out.println("horseOne.equals(horseTwo): " + horseOne.equals(horseTwo));



    }
}
