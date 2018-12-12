package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

/**
 * Interface DAO du package
 * {@link org.example.demo.ticket.consumer.contract.dao}
 */
public interface TicketDao {

    int getCountTicket(RechercheTicket pRechercheTicket);
}