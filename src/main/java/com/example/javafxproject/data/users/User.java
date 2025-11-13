package com.example.javafxproject.data.users;

public class User {
    public String userId = "";
    public String userName = "";
    public String password = "";
    public String email = "";

    public User(String userId, String userName, String password, String email) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
}
