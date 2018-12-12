package org.example.demo.ticket.business.contract.DAO;

import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

/**
 * Created by ciara on 12/12/2018.
 */
public interface TicketDao {
    public int getCountTicker(RechercheTicket pRechercheTicket);
}
