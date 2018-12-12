package org.example.demo.ticket.consumer.implementation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

public abstract class AbstractDaoImpl
{
    @Autowired
    private DataSource dataSource;

    protected DataSource getDataSource()
    {
        return dataSource;
    }


}
