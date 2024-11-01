package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ktask";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    private static Connection connection;

    public static Connection getConnection() {

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connection sucefull");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failed");
        }
        return connection;
    }

}
