package ar.com.ada.online.second.ipolymorphism;

import ar.com.ada.online.second.ipolymorphism.subclass.ElectricalVehicle;
import ar.com.ada.online.second.ipolymorphism.subclass.SportsVehicle;
import ar.com.ada.online.second.ipolymorphism.subclass.Truck;
import ar.com.ada.online.second.ipolymorphism.superclass.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle [] vehicles = {
                new Vehicle("Peugeot", "306", 1995),
                new Vehicle("Ford", "Taunus", 1977),
                new Vehicle("Fiat", "Uno", 2005),
                new ElectricalVehicle("Nissan", "Leaf", 2006, 270 ),
                new ElectricalVehicle("Volkswagen", "e-Golf", 2016, 128),
                new ElectricalVehicle("Tesla", "Model S", 2018, 595),
                new SportsVehicle("Porsche", "Porsche 718 Boxter", 2019, 50),
                new SportsVehicle("Mazda", "Mazda MX-5 Miata 2019", 2019, 300),
                new SportsVehicle("Ford", "Mustang Shelby GT350", 2019,666),
                new Truck("Ford Trucks", "F-MAX", 2019, 100),
                new Truck("Scania", "Scania 25 L/P", 2019, 999),
                new Truck("Mercedes", "Mercedes GenH2 Truck", 2019, 99)
        };

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].technicalSheet() + "\n");
        }

        System.out.println("vehicles[0].toString() = " + vehicles[0].toString());
        System.out.println("vehicles[0].hashCode() = " + vehicles[0].hashCode());
        System.out.println("vehicles[0].equals(vehicles[11]) = " + vehicles[0].equals(vehicles[11]));

    }
}
