package org.mjv.service;
import java.util.Scanner;

public class Calc {
    private Scanner sc = new Scanner(System.in);
    public void addition(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digita o segundo número: ");
        double number2 = sc.nextDouble();

        double result = number1 + number2;
        System.out.println("Resultado " + result);
    }

    public void subtraction(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double number2 = sc.nextDouble();

        double result = number1 - number2;
        System.out.println("Resultado " + result);
    }

    public void division(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double number2 = sc.nextDouble();

        double result = number1 / number2;
        System.out.println("Resultado " + result);
    }

    public void multiplication(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double number2 = sc.nextDouble();

        double result = number1 * number2;
        System.out.println("Resultado " + result);

    }
}
