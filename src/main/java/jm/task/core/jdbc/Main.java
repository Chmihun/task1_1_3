package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("John", "Doe", (byte) 25);
        userDao.saveUser("Jane", "Smith", (byte) 30);
        userDao.saveUser("Mike", "Brown", (byte) 40);
        userDao.saveUser("Anna", "White", (byte) 20);

        for (User user : userDao.getAllUsers()) {
            System.out.println(user);
        }

        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
    }

