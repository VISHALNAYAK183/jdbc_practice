package com.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.postgresql.core.SqlCommand;

public class PreparedStatementDemo {
    public static void main(String[] args) {
         String url = "jdbc:postgresql://localhost:5432/jdbc_practice";
        String username = "postgres";
        String password = "Fncvishu777";

        //Insert

    //     String sql = "INSERT INTO employees (name, salary) VALUES (?, ?)";
    //     try(Connection con = DriverManager.getConnection(url, username, password);
    //      PreparedStatement ps = con.prepareStatement(sql)
    //    ){
    //      ps.setString(1, "Abhishek");
    //      ps.setBigDecimal(2,new BigDecimal("35000.00"));
    //     int rows = ps.executeUpdate();
    //     System.out.println("Rows Affected"+rows);
    //      }catch(SQLException e){
    //         e.printStackTrace();
    //      }

    //Update

    // String sql="Update employees set salary=? where id=?";
    // try(Connection con=DriverManager.getConnection(url,username,password);
    //     PreparedStatement ps=con.prepareStatement(sql)){
    //         ps.setBigDecimal(1,new BigDecimal("70000.00"));
    //         ps.setInt(2,5);
    //         int rows=ps.executeUpdate();
    //         System.out.println("Rows Affetcted: "+1);
    //     }catch(SQLException e){
    //         e.printStackTrace();
    //     }
        // String sql="Select * from employees";
        // try(Connection con=DriverManager.getConnection(url,username,password);
        //     PreparedStatement ps=con.prepareStatement(sql);
        //         ResultSet rs=ps.executeQuery()){
        //             while(rs.next()){
        //             int id=rs.getInt("id");
        //             String name=rs.getString("name");
        //             double salary=rs.getDouble("salary");
        //             System.out.println(id + " | " + name + " | " + salary);
        //         }
        //     }catch(SQLException e){
        //         e.printStackTrace();
        //     }


    }
}