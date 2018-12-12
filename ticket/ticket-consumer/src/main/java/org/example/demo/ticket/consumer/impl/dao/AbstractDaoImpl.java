package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.model.bean.ticket.Ticket;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;


public abstract class AbstractDaoImpl {

    @Inject
    @Named("dataSourceTicket")
    private DataSource dataSource;

    public abstract void updateTicket(Ticket pTicket);

    // ...
}