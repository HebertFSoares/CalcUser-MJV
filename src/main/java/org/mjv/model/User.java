package org.mjv.model;

public class User {
    private String name;
    private int age;
    private String work;
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    private String password;

    public User(String name, int age, String work, String password) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
