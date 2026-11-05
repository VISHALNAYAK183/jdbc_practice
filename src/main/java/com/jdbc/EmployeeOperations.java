package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeOperations {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5433/jdbc_practice";
        String username = "postgres";
        String password = "Fncvishu777";

        String sql = "INSERT INTO employees (name, salary) " +
                     "VALUES ('Vishal', 50000)";

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement st = con.createStatement()) {

            int rows = st.executeUpdate(sql);

            System.out.println("Rows affected: " + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}