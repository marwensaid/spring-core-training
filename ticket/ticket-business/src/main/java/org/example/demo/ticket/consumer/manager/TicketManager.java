package org.example.demo.ticket.consumer.manager;

import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

import java.util.List;

/**
 * Created by ciara on 10/12/2018.
 */
public interface TicketManager {
    Ticket getTicket(Long pNumero) throws NotFoundException;

    List<Ticket> getListTicket(RechercheTicket pRechercheTicket);

    int getCountTicket(RechercheTicket pRechercheTicket);
}
