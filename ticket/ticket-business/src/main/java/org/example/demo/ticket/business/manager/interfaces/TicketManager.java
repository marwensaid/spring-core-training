package org.example.demo.ticket.business.manager.interfaces;

import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

import java.util.List;

public interface TicketManager
{
    List<Ticket> getListTicket(RechercheTicket pRechercheTicket);
    Ticket getTicket(Long pNumero) throws NotFoundException;
    int getCountTicket(RechercheTicket pRechercheTicket);
}
