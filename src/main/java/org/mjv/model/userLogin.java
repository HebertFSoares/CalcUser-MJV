package org.mjv.model;

import java.util.List;
import java.util.ArrayList;

public class userLogin {

    private List<User> usersList;

    public userLogin() {
        this.usersList = new ArrayList<>();
    }

    public void signupUser(String name, String password, String work, int age) {
        if (!searchUsername(name)) {
            User newUser = new User(name, age, work, password);
            usersList.add(newUser);
            System.out.println("Usuário cadastrado com sucesso!");
        }
    }

    public User loginUser(String name, String password) {
        if (usersList.isEmpty()) {
            System.out.println("Nenhum usuário no sistema!");
            return null;
        } else {
            User searchedUser = usersList.stream()
                    .filter(u -> name.equals(u.getName()))
                    .findAny().orElse(null);
            if (searchedUser == null) {
                System.out.println("Usuário não encontrado, tente novamente");
                return null;
            }
            if (!searchedUser.getPassword().equals(password)) {
                System.out.println("Senha incorreta, tente novamente");
                return null;
            } else {
                System.out.println("Usuário encontrado, login efetuado com sucesso");
                return searchedUser;
            }
        }
    }

    private boolean searchUsername(String name) {
        if (usersList.stream().anyMatch(u -> name.equals(u.getName()))) {
            System.out.println("Usuário já existe");
            return true;
        } else {
            return false;
        }
    }
}
