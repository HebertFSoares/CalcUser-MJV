package org.mjv.service;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Calc {
    private Scanner sc = new Scanner(System.in);
    private List<Double> history;

    public Calc() {
        this.history = new ArrayList<>();
    }
    public double addition(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digita o segundo número: ");
        double number2 = sc.nextDouble();
        double result = number1 + number2;
        history.add(result);

        return result;
    }

    public double subtraction(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double number2 = sc.nextDouble();
        double result = number1 - number2;
        history.add(result);

        return result;
    }

    public double division(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double number2 = sc.nextDouble();
        double result = number1 / number2;
        history.add(result);

        return result;
    }

    public double multiplication(){
        System.out.println("Digite o primeiro número: ");
        double number1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double number2 = sc.nextDouble();
        double result = number1 * number2;
        history.add(result);

        return result;
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("Nenhum cálculo no histórico.");
        } else {
            System.out.println("Histórico de Cálculos:");
            for (int i = 0; i < history.size(); i++) {
                System.out.println("Cálculo " + (i + 1) + ": " + history.get(i));
            }
        }
    }

}
