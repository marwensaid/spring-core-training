package org.example.demo.ticket.business.contract;

import org.example.demo.ticket.business.impl.manager.ManagerFactoryImpl;
import org.example.demo.ticket.business.impl.manager.ProjetManagerImpl;
import org.example.demo.ticket.business.impl.manager.TicketManagerImpl;

public interface ManagerFactory {
    ManagerFactoryImpl INSTANCE = new ManagerFactoryImpl();

    static ManagerFactory getInstance() {
        return ManagerFactory.INSTANCE;
    }

    ProjetManagerImpl getProjetManager();

    TicketManagerImpl getTicketManager();

    void setProjetManager(ProjetManagerImpl pProjetManager);

    void setTicketManager(TicketManagerImpl pTicketManager);
}
