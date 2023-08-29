package com.bootcoding.jdbc;

import com.bootcoding.jdbc.methods.JdbcUsingMethods;

public class customerApp {
    public static void main(String[] args) {
        JdbcUsingMethods query= new JdbcUsingMethods();
       // query.getAllcustomers();
       // query.getCustomercountbycity();
        // query.getAllBysalesamanId(2);
          query.getcustomerbyid(2);
    }
}
