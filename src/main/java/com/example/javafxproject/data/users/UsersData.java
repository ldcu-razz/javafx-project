package com.example.javafxproject.data.users;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class UsersData {

    public ArrayList<User> userList = new ArrayList<>(Arrays.asList(
            new User("12", "test", "123", "asdfd"),
            new User("1231", "s", "24231", "sadasd")
    ));

    public void addUser(User user) {
        userList.add(user);
    }

    public void deleteUser(User user) {
        userList.remove(user);
    }

}
