package lab1;

import java.nio.file.Path;
import java.util.Collection;

class User{
    private String login;
    private String password;
    private String email;
    private String phoneNumber;
    private String name;
    private String lastName;
    private Path avatar;
    private int reputation;
    private String role;

    public User(String login, String password, String email, String phoneNumber, String name, String lastName, Path avatar, int reputation, String role) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.lastName = lastName;
        this.avatar = avatar;
        this.reputation = reputation;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", avatar=" + avatar +
                ", reputation=" + reputation +
                ", role='" + role + '\'' +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Path getAvatar() {
        return avatar;
    }

    public void setAvatar(Path avatar) {
        this.avatar = avatar;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

class Ban{
    User admin;
    User user;
    String reason;
}

class Message{
    User userFrom;
    User userTo;
    String text;
}
