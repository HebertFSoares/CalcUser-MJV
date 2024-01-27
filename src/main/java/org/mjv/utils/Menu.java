package org.mjv.utils;
import org.mjv.model.*;
import org.mjv.service.Calc;

import java.util.Scanner;
public class Menu {
    private final Scanner sc = new Scanner(System.in);
    private final userLogin userList = new userLogin();
    private final Calc calculadora = new Calc();

    public void toScreen(){
        screen();
    }

    public void screen(){
        System.out.println("Bem vindo ao CalcUser! \n Escolha uma opção \n 1 - Me cadastrar \n 2 - Login \n 3 - Sair");
        int response = sc.nextInt();

        switch (response){
            case 1 : signupUser();
            break;
            case 2 :
                User user = loginUser();
                if (user == null){
                    System.out.println("Usuario não encontrado, tente novamente");
                }else {
                    System.out.println("CalcUser...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    calcUser(user);
                    break;
                }
            case 3 :
                System.out.println("Saindo da aplicação...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            default:
                System.out.println("Opção invalida");
                toScreen();
        }
    }

    private void signupUser(){
        System.out.println("Digite seu username desejado: ");
        String name = sc.next();
        System.out.println("Digite a sua senha: ");
        String password = sc.next();
        System.out.println("Digite a sua idade: ");
        int age = sc.nextInt();
        System.out.println("Digite o sua profissão: ");
        String work = sc.next();

        userList.signupUser(name, password, work, age);;
        toScreen();
    }

    private User loginUser(){
        System.out.println("Digite seu nome: ");
        String name = sc.next();
        System.out.println("Digite a sua senha:");
        String password = sc.next();
        User userLogin = userList.loginUser(name,password);
        if (userLogin != null){
            System.out.println("Login realizado com sucesso!");
            return userLogin;
        }else {
            System.out.println("Que pena acho que você errou alguma coisa :(, tente novamente");
            return null;
        }
    }

    private void calcUser(User user){
        System.out.printf("\nBem vindo ao CalcUser! selecione a opção desejada" +
                "\n 1 : Adição" +
                "\n 2 : Subtração" +
                "\n 3 : Divisão" +
                "\n 4 : Multiplicação" +
                "\n 0 : Sair ",
                user.getName());
        int response = sc.nextInt();
        switch (response){
            case 1:
                System.out.printf("O resultado é: " + calculadora.addition());
                calcUser(user);
                break;
            case 2:
                System.out.printf("O resultado é: " + calculadora.subtraction());
                calcUser(user);
                break;
            case 3:
                System.out.printf("O resultado é:" + calculadora.division());
                calcUser(user);
                break;
            case 4:
                System.out.printf("O resultado é: " + calculadora.multiplication());
                calcUser(user);
                break;
            case 0:
                toScreen();
                break;
            default:
                System.out.println("Dígito inválido!");
                calcUser(user);
        }
    }
}
