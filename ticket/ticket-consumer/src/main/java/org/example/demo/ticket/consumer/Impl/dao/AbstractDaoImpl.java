package org.example.demo.ticket.consumer.Impl.dao;

import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;
import java.util.List;

public abstract class AbstractDaoImpl {

    @Inject
    @Named("dataSourceTicket")
    private DataSource dataSource;

    protected DataSource getDataSource() {
        return dataSource;
    }

    public abstract int getCountTicket(RechercheTicket pRechercheTicket);

    public abstract List<TicketStatut> getListStatut();
}