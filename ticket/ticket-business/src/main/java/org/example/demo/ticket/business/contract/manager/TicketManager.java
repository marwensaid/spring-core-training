package org.example.demo.ticket.business.contract.manager;


import java.util.List;

import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;


/**
 * Manager des beans du package Ticket.
 *
 * @author lgu
 */
public interface TicketManager {

    Ticket getTicket(Long pNumero) throws NotFoundException;
    List<Ticket> getListTicket(RechercheTicket pRechercheTicket);
    int getCountTicket(RechercheTicket pRechercheTicket);
}
