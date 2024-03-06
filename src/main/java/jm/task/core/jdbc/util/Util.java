package jm.task.core.jdbc.util;


import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static Connection connection;

    // реализуйте настройку соеденения с БД
    public static Connection dbConnect() {
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("База данных подключена");
            }
        } catch (SQLException e) {
            System.err.println("Драйвер не найден");
        }
        return connection;
    }

}
