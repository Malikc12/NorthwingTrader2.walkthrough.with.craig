package com.northwind.data;

import javax.sql.DataSource;

public class CustomerDAO {
    private DataSource dataSource;

    public CustomerDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
