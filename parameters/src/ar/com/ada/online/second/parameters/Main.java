package ar.com.ada.online.second.parameters;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Result result = new Result();
        Arithmetic calculations = new Arithmetic();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros para hacer la suma: ");
        calculations.sum(result, keyboard.nextInt(), keyboard.nextInt());

        System.out.println("ingrese dos numeros enteros para hacer la resta: ");
        calculations.subtraction(result, keyboard.nextInt(), keyboard.nextInt());

        System.out.println("ingrese dos numeros enteros para hacer la multiplicacion: ");
        calculations.multiplication(result, keyboard.nextInt(), keyboard.nextInt());

        System.out.println("ingrese dos numeros enteros para hacer la division: ");
        calculations.division(result, keyboard.nextInt(), keyboard.nextInt());

        System.out.println("la suma da: " + result.getResultSum());
        System.out.println("la resta da: " + result.getResultSubtraction());
        System.out.println("la multiplicacion da: " + result.getResultMultiplication());
        System.out.println("la division da: " + result.getResultDivision());


    }
}
