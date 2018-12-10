package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public interface ManagerFactoryImpl {

    ProjetManager getProjetManager();

    void setProjetManager(ProjetManager pProjectManager);

    TicketManager getTicketManager();

    void setTicketManager(TicketManager pTicketManager);
}
