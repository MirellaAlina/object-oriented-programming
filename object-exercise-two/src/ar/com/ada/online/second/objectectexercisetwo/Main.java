package ar.com.ada.online.second.objectectexercisetwo;


import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

//        Date expirationDate = new Date();
////        String fechaFormateada = "dd/MM/yyyy";
//        SimpleDateFormat sdf = new SimpleDateFormat(fechaFormateada);
//        System.out.println(expirationDate);

        Date actualDate = new Date();
        System.out.println(actualDate);
//        String strActualDate = "dd/MM/yyyy";
//        SimpleDateFormat objSDF = new SimpleDateFormat(strActualDate);


        Item product = new Item();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("ingrese el nombre del producto: ");
        product.name = keyboard.next();
        System.out.println("ingrese el precio del producto: ");
        product.price = keyboard.nextDouble();
        System.out.println("Ingrese la fecha de vencimiento en : " );
        String fechaFormateada = keyboard.next();
        Date expirationDate = new Date(fechaFormateada);

        Boolean canItBeSold = product.canItBeSold();
        if (product.canItBeSold() == true ){
            System.out.println("Nombre: " + product.name);
            System.out.println("Precio: " + product.price);
            product.calculateTax();
            System.out.println("El total a pagar es: $" + product.getTotalToPay());
        }else{
            System.out.println("Este item no está habilitado para la venta");
        }


    }
}
