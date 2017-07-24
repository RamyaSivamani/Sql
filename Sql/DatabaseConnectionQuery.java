package com.kgfsl.Sql;
import java.sql.*;

//import utility.DBConnection;

public class DatabaseConnectionQuery {

    public static void main(String[] args) {
        Connection conn = DatabaseConnection.getDatabaseConnection();

        try {
            String query = "SELECT name,doj FROM employee WHERE MONTH(doj) = 6";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1)+""+resultSet.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}