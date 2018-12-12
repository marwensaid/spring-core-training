package org.example.demo.ticket.consumer.impl;

import org.example.demo.ticket.consumer.contrat.TicketDao;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.exception.TechnicalException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

import java.util.List;

public class TicketDaoImpl implements TicketDao {
    @Override
    public int getCountTicket(RechercheTicket pRechercheTicket) {
        return 0;
    }

    @Override
    public List<TicketStatut> getListStatut() {
        return null;
    }

    @Override
    public void updateTicketStatut(TicketStatut pTicketStatut) {

    }

    @Override
    public void insertTicketStatut(TicketStatut pTicketStatut) {

    }

    @Override
    public void updateTicket(Ticket pTicket) throws TechnicalException {

    }
}
