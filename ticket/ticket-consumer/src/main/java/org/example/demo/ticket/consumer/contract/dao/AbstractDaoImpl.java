package org.example.demo.ticket.consumer.contract.dao;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;
import java.util.List;

public abstract class AbstractDaoImpl<T> {
    @Inject
    @Named("dataSourceTicket")
    private DataSource dataSource;

    protected DataSource getDataSource(){
        return dataSource;
    }

    public abstract List<T> getAll();

    public abstract T get();
}
