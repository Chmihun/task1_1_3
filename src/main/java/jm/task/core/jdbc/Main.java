package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Iurii", "Gagarin", (byte) 34);
        userService.saveUser("German", "Titov", (byte) 65);
        userService.saveUser("Andrean", "Nikolaev", (byte) 75);
        userService.saveUser("Valentina", "Tereshkova", (byte) 87);

        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }

}

