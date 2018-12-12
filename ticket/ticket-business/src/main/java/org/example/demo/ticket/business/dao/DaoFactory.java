package org.example.demo.ticket.business.dao;

import org.example.demo.ticket.consumer.impl.dao.ProjetDaoImpl;
import org.example.demo.ticket.consumer.impl.dao.TicketDaoImpl;

public class DaoFactory {
    private ProjetDaoImpl projetDao;
    private TicketDaoImpl ticketDao;

    public void setProjetDao(ProjetDaoImpl projetDao) {
        this.projetDao = projetDao;
    }

    public ProjetDaoImpl getProjetDao() {
        return projetDao;
    }

    public void setTicketDao(TicketDaoImpl ticketDao) {
        this.ticketDao = ticketDao;
    }

    public TicketDaoImpl getTicketDao() {
        return ticketDao;
    }
}
