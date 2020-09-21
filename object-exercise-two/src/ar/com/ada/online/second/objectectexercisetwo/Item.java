package ar.com.ada.online.second.objectectexercisetwo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

public class Item {
    String name;
    Double price;
    Double tax = 0.21;
    Date expirationDate = new Date();
    String fechaFormateada = "yyyy/MM/dd";
    SimpleDateFormat fecha = new SimpleDateFormat(fechaFormateada);


    Date actualDate = new Date();


//    String strActualDate = "dd/MM/yyyy";
//    SimpleDateFormat objSDF = new SimpleDateFormat(strActualDate);


    Double getTotalToPay() {
        Double totalToPay = this.price + (this.price * this.tax);

        return totalToPay;
    }

    void calculateTax() {
        System.out.println("El impuesto es " + tax);
    }

    Boolean canItBeSold() {
        if (expirationDate.after(actualDate)) {
            Boolean canItBeSold = true;
            System.out.println(expirationDate);
            return true;

        }
        return false;
    }


}