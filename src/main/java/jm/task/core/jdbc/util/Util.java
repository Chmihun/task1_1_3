package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    static Connection connection;


    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql:" +
                    "//localhost:3306/world", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
