package com.jdbc;

import java.sql.*;

public class FetchEmployees {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5433/jdbc_practice";
        String username = "postgres";
        String password = "Fncvishu777";

        String sql = "SELECT * FROM employees";

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println(id + " | " + name + " | " + salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}