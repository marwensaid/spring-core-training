package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

public interface TicketDao {

    int getCountTicket(RechercheTicket pRechercheTicket);
}
