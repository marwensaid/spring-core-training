package org.example.demo.ticket.business.manager.interfaces;

import org.example.demo.ticket.business.manager.implementations.TicketManagerImpl;
import org.example.demo.ticket.model.bean.ticket.Ticket;

public interface ManagerFactory
{
    ProjetManager getProjetManager();
    TicketManager getTicketManager();

    void setProjetManager(ProjetManager projetManager);
    void setTicketManager(TicketManager ticketManager);
}
