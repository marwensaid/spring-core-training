package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManagerImpl;
import org.example.demo.ticket.business.manager.TicketManagerImpl;

public interface ManagerFactory {

    ProjetManagerImpl getProjetManager();

    void setProjetManager(ProjetManagerImpl pProjectManager);

    TicketManagerImpl getTicketManager();

    void setTicketManager(TicketManagerImpl pTicketManager);
}
