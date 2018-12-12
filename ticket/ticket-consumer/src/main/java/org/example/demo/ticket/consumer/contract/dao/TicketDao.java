package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

import java.util.List;

/**
 * Interface DAO du package
 */
public interface TicketDao {
    int getCountTicket(RechercheTicket pRechercheTicket);
    List<TicketStatut> getListStatut();
    void updateTicketStatut(TicketStatut pTicketStatut);
    void updateTicketStatut1(TicketStatut pTicketStatut);
    void updateTicketStatut2(TicketStatut pTicketStatut);
    void updateTicketStatut3(TicketStatut pTicketStatut);
    void updateTicketStatut4(TicketStatut pTicketStatut);
    void insertTicketStatut(TicketStatut pTicketStatut);
}