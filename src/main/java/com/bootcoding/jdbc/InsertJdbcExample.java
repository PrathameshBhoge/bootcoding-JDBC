package com.bootcoding.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertJdbcExample {
    public static void main(String[] args) {
        try{

            Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres","Mr.cool@123");

            Statement stmt= conn.createStatement();

            String sql = "INSERT INTO customer VALUES(2000, 'Raju', 'Nagpur', 'raju@nagpur.com', 123)";

            int i = stmt.executeUpdate(sql);

            conn.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
