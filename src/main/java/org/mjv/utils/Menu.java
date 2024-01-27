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
        System.out.println("Bem vindo ao CalcUser! \n Escolha uma opção \n 1 - Me cadastrar \n 2 - Login \n 3 - Alterar dados  \n 4 - Historico de calculo \n 5 - Sair");
        int choice = sc.nextInt();

        switch (choice){
            case 1 : signupUser();
            break;
            case 2 :
                User user = loginUser();
                if (user == null){
                    System.out.println("Usuario não encontrado, tente novamente");
                }else {
                    System.out.println("Iniciando a CalcUser...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    calcUser(user);
                    break;
                }
            case 3:
                User loggedInUser = loginUser();
                if (loggedInUser != null) {
                    updateUser(loggedInUser);
                }
                break;
            case 4:
                calculadora.showHistory();
                toScreen();
                break;
            case 5 :
                System.out.println("Saindo da aplicação...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Opção invalida");
                toScreen();
        }
    }

    private void signupUser(){
        System.out.println("Digite seu nome: ");
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

    private void updateUser(User user) {
        boolean voltarMenu = false;

        while (!voltarMenu) {
            System.out.println("Opções de alteração:" +
                    "\n1 - Alterar senha" +
                    "\n2 - Alterar idade" +
                    "\n3 - Alterar profissão" +
                    "\n0 - Voltar");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Digite a nova senha: ");
                    String newPassword = sc.next();
                    userList.updateUser(user, newPassword, user.getAge(), user.getWork());
                    break;
                case 2:
                    System.out.println("Digite a nova idade: ");
                    int newAge = sc.nextInt();
                    userList.updateUser(user, user.getPassword(), newAge, user.getWork());
                    break;
                case 3:
                    System.out.println("Digite a nova profissão: ");
                    String newWork = sc.next();
                    userList.updateUser(user, user.getPassword(), user.getAge(), newWork);
                    break;
                case 0:
                    System.out.println("Voltando para o menu...");
                    voltarMenu = true;
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    screen();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
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
                System.out.println("Saindo do CalcUser...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                toScreen();
                break;
            default:
                System.out.println("Dígito inválido!");
                calcUser(user);
        }
    }
}
