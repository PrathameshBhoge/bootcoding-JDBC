package com.bootcoding.jdbc.methods;

import com.bootcoding.jdbc.utils.DBConnectionUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUsingMethods {
    public List<Customer> getAllcustomers(){
        try{
            Connection connection = DBConnectionUtils.getConnection();
            Statement statement = connection.createStatement();
            String query  =  "SELECT * FROM CUSTOMER";
            ResultSet rs = statement.executeQuery(query);

            List<Customer> customers= new ArrayList<>();
             while(rs.next()){
                 int custId = rs.getInt("customer_id");

                 String name = rs.getString("cust_name");
                 String city = rs.getString("city");
                 String email = rs.getString("email");
                 int salesManId = rs.getInt("salesman_id");

                 Customer customer=new Customer();
                 customer.setCustomer_id(custId);
                 customer.setCust_name(name);
                 customer.setCity(city);
                 customer.setSalesman_id(salesManId);
                 customer.setEmail(email);

                 System.out.println(customer.getCustomer_id());
                 System.out.println(customer.getCust_name());
                 System.out.println(customer.getCity());
                 System.out.println(customer.getSalesman_id());
                 System.out.println(customer.getEmail());
             }
             return customers;

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public int gettoatalCustomer(){
        try{
            Connection connection= DBConnectionUtils.getConnection();
            Statement statement= connection.createStatement();
            String query= "SELECT Count(*) from customer";
            ResultSet rs= statement.executeQuery(query);

            if(rs.next()){
                int count= rs.getInt("count");
                return count;
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }

    public int getCustomercountbycity(String city_name){
        try{
            Connection connection=DBConnectionUtils.getConnection();
            Statement statement= connection.createStatement();
            String query= "Select count(*) from customer where city="+city_name+"";
            ResultSet rs= statement.executeQuery(query);

            if(rs.next()){
                int count= rs.getInt("count");
                System.out.println(count);
                return count;
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }

    public List<Customer> getallcustomerscity(String cityname) {
        try {
            Connection connection = DBConnectionUtils.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM CUSTOMERS Where city= "+cityname+"";
            ResultSet rs = statement.executeQuery(query);

            List<Customer> customers = new ArrayList<>();
            while (rs.next()) {
                int custId = rs.getInt("customer_id");

                String name = rs.getString("cust_name");
                String city = rs.getString("city");
                String email = rs.getString("email");
                int salesManId = rs.getInt("salesman_id");

                Customer customer = new Customer();
                customer.setCustomer_id(custId);
                customer.setCust_name(name);
                customer.setCity(city);
                customer.setSalesman_id(salesManId);
                customer.setEmail(email);

                customers.add(customer);

                System.out.println(customer.getCust_name());
                System.out.println(customer.getCity());

            }
            return customers;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public List<Customer> getAllBysalesamanId(int sales_id){
        try{

            Connection connection= DBConnectionUtils.getConnection();
            Statement statement= connection.createStatement();
            String query = "Select * from customer where salesman_id= "+sales_id+"";
            ResultSet rs= statement.executeQuery(query);
            List<Customer> customers = new ArrayList<>();
            while(rs.next()){
                int custId = rs.getInt("customer_id");

                String name = rs.getString("cust_name");
                String city = rs.getString("city");
                String email = rs.getString("email");
                int salesManId = rs.getInt("salesman_id");

                Customer customer = new Customer();
                customer.setCustomer_id(custId);
                customer.setCust_name(name);
                customer.setCity(city);
                customer.setSalesman_id(salesManId);
                customer.setEmail(email);
                customers.add(customer);
                System.out.println(customer.getCustomer_id()+" ");
                System.out.print(customer.getCust_name()+" ");
                System.out.println(customer.getSalesman_id());

            }
            return  customers;

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public String getcustomerbyid(int cust_id){

        try{
            Connection connection= DBConnectionUtils.getConnection();
            Statement statement= connection.createStatement();
            String query = "Select cust_Name from customer where customer_id ="+cust_id+" ";
            ResultSet rs= statement.executeQuery(query);

            int custId = rs.getInt("customer_id");
            String name = rs.getString("cust_name");

            Customer customer= new Customer();
            customer.setCust_name(name);
            System.out.println(customer.getCust_name());


        }catch(Exception ex){

        }
        return null;
    }
}
