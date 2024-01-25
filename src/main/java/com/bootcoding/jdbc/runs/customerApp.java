package com.bootcoding.jdbc.runs;

import com.bootcoding.jdbc.methods.JdbcUsingMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class customerApp {
    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres","Mr.cool@123");
            Statement stmt = conn.createStatement();
           // stmt.executeUpdate("INSERT INTO customer VALUES (3000, 'Raju', 'Nagpur', 'raju@nagpur.com', 123)");


            stmt.execute("CREATE TABLE Customerssss (\n" +
                    "    CustomerID INT PRIMARY KEY,\n" +
                    "    FirstName VARCHAR(50),\n" +
                    "    LastName VARCHAR(50),\n" +
                    "    Email VARCHAR(100) UNIQUE,\n" +
                    "    Phone VARCHAR(20),\n" +
                    "    Address VARCHAR(255),\n" +
                    "    City VARCHAR(50),\n" +
                    "    State VARCHAR(50),\n" +
                    "    ZipCode VARCHAR(20),\n" +
                    "    Country VARCHAR(50)\n" +
                    ")");
            stmt.execute("INSERT INTO Customerssss (CustomerID, FirstName, LastName, Email, Phone, Address, City, State, ZipCode, Country)\n" +
                    "VALUES\n" +
                    "(11, 'John', 'Doe', 'john.doe@example.com', '123-456-7890', '123 Main St', 'Anytown', 'CA', '12345', 'USA'),\n" +
                    "(21, 'Jane', 'Smith', 'jane.smith@example.com', '987-654-3210', '456 Oak St', 'Sometown', 'NY', '54321', 'USA'),\n" +
                    "(31, 'Bob', 'Johnson', 'bob.johnson@example.com', '555-123-4567', '789 Pine St', 'Othercity', 'TX', '67890', 'USA');\n");

            stmt.execute("UPDATE Customerssss\n" +
                    "SET FirstName = 'UpdatedFirstName', LastName = 'UpdatedLastName', Email = 'updated.email@example.com'\n" +
                    "WHERE CustomerID = 11;\n");
            ResultSet rs = stmt.executeQuery("Select * from customerssss");


            while(rs.next()){
                 int CustomerID = rs.getInt("CustomerID");
                 String FirstName = rs.getString("FirstName");
                 String LastName = rs.getString("LastName");
                 String Email = rs.getString("Email");
                 long Phone = rs.getLong("Phone");
                 String Address = rs.getString("Address");
                 String City = rs.getString("City");
                 String State = rs.getString("State");
                 long Zipcode = rs.getLong("Zipcode");
                 String Country = rs.getString("Country");

                System.out.println("CustomerID : "+CustomerID);
                System.out.println("First Name : "+FirstName);
                System.out.println("Last Name : "+LastName);
                System.out.println("Email : "+Email);
                System.out.println("Phone : "+Phone);
                System.out.println("Address : "+Address);
                System.out.println("City : "+City);
                System.out.println("State "+State);
                System.out.println("ZipCode "+Zipcode);
                System.out.println("Country "+Country);
            }
            conn.close();
        }catch(Exception Ex){
            Ex.printStackTrace();
        }
    }

}
