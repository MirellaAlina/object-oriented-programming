package ar.com.ada.online.second.obj;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Mirella", "Ibañez");
        Person person3 = new Person("Mirella", "Ibañez");
        Person person4 = new Person("Angel");

        person1.setName("Lulú");
        person1.setLastName("Roldán");

        System.out.println("person1.toSrting(): " + person1.toString());
        System.out.println("person2.toString(): " + person2.toString());
        System.out.println("person3.toString(): " + person3.toString());
        System.out.println("person4.toString(): " + person4.toString());

        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println("person3.hashCode(): " + person3.hashCode());
        System.out.println("person4.hashCode(): " + person4.hashCode());

        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person2.equals(person3): " + person2.equals(person3));
        System.out.println("person3.equals(person4): " + person3.equals(person4));
    }
}
