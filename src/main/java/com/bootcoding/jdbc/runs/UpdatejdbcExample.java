package com.bootcoding.jdbc.runs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatejdbcExample {

    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres","Mr.cool@123");

            Statement stmt= conn.createStatement();

            String sql = "UPDATE customer set city = 'Wardha' where customer_id = 40";

            int i = stmt.executeUpdate(sql);

            conn.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
