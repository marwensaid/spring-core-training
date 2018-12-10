package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public interface ManagerFactory {
    ProjetManager getProjetManager();
    void setProjetManager(ProjetManager pProjetManager);
    TicketManager getTicketManager();
    void setTicketManager(TicketManager tTicketManager);
}
