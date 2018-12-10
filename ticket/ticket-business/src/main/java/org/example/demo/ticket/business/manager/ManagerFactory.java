package org.example.demo.ticket.business.manager;

import org.example.demo.ticket.business.manager.contract.manager.ProjetManager;
import org.example.demo.ticket.business.manager.contract.manager.TicketManager;

public interface ManagerFactory {
    ProjetManager getProjetManager();
    void setProjetManager(ProjetManager pProjetManager);
    TicketManager getTicketManager();
    void setTicketManager(TicketManager tTicketManager);
}
