package org.example.demo.ticket.business;

import org.example.demo.ticket.business.impl.manager.TicketManagerImpl;

public interface IManagerFactory {
    IProjectManager getProjetManager();

    void setProjetManager(IProjectManager pProjetManager);

    void setTicketManager(TicketManagerImpl tTicketManagerImpl);

    TicketManagerImpl getTicketManager();
}
