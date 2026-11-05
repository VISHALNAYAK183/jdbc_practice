package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmployee {
    public static void main(String[] args) {
         String url = "jdbc:postgresql://localhost:5433/jdbc_practice";
        String username = "postgres";
        String password = "Fncvishu777";

        String sql="Delete from employees where id=3";

        try(Connection con=DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement()
            
        ){
            int rows=st.executeUpdate(sql);
            System.out.println("Rows Affected: " + rows);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}