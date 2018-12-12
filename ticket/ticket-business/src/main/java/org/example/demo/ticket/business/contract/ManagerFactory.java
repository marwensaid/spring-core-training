package org.example.demo.ticket.business.contract;

import org.example.demo.ticket.business.manager.impl.ManagerFactoryImpl;
import org.example.demo.ticket.business.manager.impl.ProjetManagerImpl;
import org.example.demo.ticket.business.manager.impl.TicketManagerImpl;

import javax.inject.Inject;

public interface ManagerFactory {
    ManagerFactoryImpl INSTANCE = new ManagerFactoryImpl();

    static ManagerFactory getInstance() {
        return ManagerFactory.INSTANCE;
    }

    @Inject
    ProjetManager getProjetManager();

    @Inject
    TicketManagerImpl getTicketManager();

    void setProjetManager(ProjetManagerImpl pProjetManager);

    void setTicketManager(TicketManagerImpl pTicketManager);
}
