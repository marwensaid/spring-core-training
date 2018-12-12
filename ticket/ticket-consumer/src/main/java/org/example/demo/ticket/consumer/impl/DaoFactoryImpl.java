package org.example.demo.ticket.consumer.impl;


import org.example.demo.ticket.consumer.contrat.DaoFactory;
import org.example.demo.ticket.consumer.contrat.ProjetDao;
import org.example.demo.ticket.consumer.contrat.TicketDao;

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
