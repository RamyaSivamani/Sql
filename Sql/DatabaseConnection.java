package com.kgfsl.Sql;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    static Connection conn = null;

    private DatabaseConnection() {
    }

    public static Connection getDatabaseConnection() {

        try {
            if (conn == null) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}