package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Iurii", "Gagarin", (byte) 34);
        userDao.saveUser("German", "Titov", (byte) 65);
        userDao.saveUser("Andrean", "Nikolaev", (byte) 75);
        userDao.saveUser("Valentina", "Tereshkova", (byte) 87);

        for (User user : userDao.getAllUsers()) {
            System.out.println(user);
        }

        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
    }

