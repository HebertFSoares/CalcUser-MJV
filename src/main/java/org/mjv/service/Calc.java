package org.mjv.service;
import java.util.Scanner;

public class Calc {
    private Scanner sc = new Scanner(System.in);
    public double addition(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digita o segundo número: ");
        double number2 = sc.nextDouble();

        return number1 + number2;
    }

    public double subtraction(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double number2 = sc.nextDouble();

        return number1 - number2;
    }

    public double division(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double number2 = sc.nextDouble();

        return number1 / number2;
    }

    public double multiplication(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double number2 = sc.nextDouble();

        return number1 * number2;
    }
}
