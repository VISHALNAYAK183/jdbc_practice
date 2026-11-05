package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5433/jdbc_practice";
        String username = "postgres";
        String password = "Fncvishu777";

        try (Connection con =
                 DriverManager.getConnection(url, username, password)) {

            System.out.println("Database connected successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}