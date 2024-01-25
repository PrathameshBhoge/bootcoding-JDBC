package com.bootcoding.jdbc.runs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserjdbcExample {
    public static void main(String[] args) {
        try{
            //1. Load JDbc Driver
            Class.forName("org.postgresql.Driver");

            //2.Get Database Connection
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres","Mr.cool@123");

            //3.Query database using Statement object
            Statement stmt= conn.createStatement();

            //4.Execute Query and GEt ResultSet
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer");

            //4.1 Extract Result
            while(rs.next()){
                int custId= rs.getInt("customer_id");
                String name= rs.getString("cust_name");
                String city = rs.getString("city");
                String email = rs.getString("email");
                int salesManId = rs.getInt("salesman_id");

                System.out.println("Id = "+ custId);
                System.out.println("Name = "+ name);
                System.out.println("City = "+ city);
                System.out.println("email = "+ email);
                System.out.println("Salesman Id = "+ salesManId);
            }



            //5.close connection
            conn.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
