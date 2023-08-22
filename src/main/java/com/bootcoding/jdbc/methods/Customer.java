package com.bootcoding.jdbc.methods;

public class Customer {
    private int customer_id;
    private String cust_name;
    private  String city;

    private String email;
    private int salesman_id;

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalesman_id() {
        return salesman_id;
    }

    public void setSalesman_id(int salesman_id) {
        this.salesman_id = salesman_id;
    }



}
