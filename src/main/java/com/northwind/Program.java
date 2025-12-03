package com.northwind;

import com.northwind.data.CustomerDAO;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class Program {
    public static void main(String[] args) {
        String username = args [0];
        String password = args [1];
        String url = "jdbc:mysql://localhost:3306/northwind";

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);


        CustomerDAO customerDAO = new CustomerDAO(dataSource)


        System.out.println(username + " " + password);
    }
}
