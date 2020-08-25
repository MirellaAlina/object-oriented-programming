package ar.com.ada.online.second.objectexerciseone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        Person mirella = new Person();
        Vehicle Taunus = new Vehicle();

        dog.breed = "Labrador";
        dog.color = "Amarillo";
        dog.name = "Alka";

        mirella.age = 24;
        mirella.name = "Mirella";
        mirella.lastName = "Ibañez";

        Taunus.brand = "Ford";
        Taunus.color = "Bordo";
        Taunus.maxSpeed = 140;

        System.out.println(mirella.name + " " + mirella.lastName + ", " + mirella.age + " años");
        mirella.talk();

        System.out.println(dog.name + ", " + dog.color + ", " + dog.breed);
        dog.eat();

        System.out.println(Taunus.brand + ", " + Taunus.color + ", " + Taunus.maxSpeed + " km/h");
        Taunus.moveOn();


    }
}
