package org.example.demo.ticket.consumer.impl.dao;


import org.example.demo.ticket.consumer.contrat.dao.DaoFactory;
import org.example.demo.ticket.consumer.contrat.dao.ProjetDao;
import org.example.demo.ticket.consumer.contrat.dao.TicketDao;

public class DaoFactoryImpl implements DaoFactory {

    @Override
    public ProjetDao getProjetDao() {
        return null;
    }

    @Override
    public TicketDao getTicketDao() {
        return null;
    }
}
