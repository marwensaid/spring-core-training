package org.example.demo.ticket.consumer.impl.dao;

import javax.activation.DataSource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by ciara on 12/12/2018.
 */
public abstract class AbstractDaoImpl {

    @Inject
    @Named("dataSourceTicket")
    private DataSource dataSource;

    protected DataSource getDataSource() {
        return dataSource;
    }
}
