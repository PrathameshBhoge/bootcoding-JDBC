package com.bootcoding.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteJdbcExample {
    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver");


            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "Mr.cool@123");


            Statement stmt = conn.createStatement();
            String sql = "DELETE from patient where id = 1072";

            int i = stmt.executeUpdate(sql);


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
