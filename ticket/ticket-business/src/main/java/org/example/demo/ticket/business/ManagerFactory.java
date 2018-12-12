package org.example.demo.ticket.business;

import org.example.demo.ticket.business.contract.manager.TicketManager;
import org.example.demo.ticket.business.contract.manager.ProjetManager;

public interface ManagerFactory {
    ProjetManager getProjetManager();
    void setProjetManager(ProjetManager pProjetManager);
    TicketManager getTicketManager();
    void setTicketManager(TicketManager tTicketManager);
}
