package org.mjv.service;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Calc {
    private Scanner sc = new Scanner(System.in);
    private List<Double> History;

    public Calc() {
        this.History = new ArrayList<>();
    }
    public double addition(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digita o segundo número: ");
        double number2 = sc.nextDouble();
        double result = number1 + number2;
        History.add(result);

        return result;
    }

    public double subtraction(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double number2 = sc.nextDouble();
        double result = number1 - number2;
        History.add(result);

        return result;
    }

    public double division(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double number2 = sc.nextDouble();
        double result = number1 / number2;
        History.add(result);

        return result;
    }

    public double multiplication(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double number2 = sc.nextDouble();
        double result = number1 * number2;
        History.add(result);

        return result;
    }

    public void showHistory() {
        System.out.println("Histórico de Cálculos:");
        for (int i = 0; i < History.size(); i++) {
            System.out.println("Cálculo " + (i + 1) + ": " + History.get(i));
        }
    }

}
