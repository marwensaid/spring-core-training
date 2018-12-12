package org.example.demo.ticket.business.manager.myInterface;

import org.example.demo.ticket.business.manager.impl.ManagerFactoryImpl;
import org.example.demo.ticket.business.manager.impl.ProjetManagerImpl;
import org.example.demo.ticket.business.manager.impl.TicketManagerImpl;

public interface ManagerFactory {
    ManagerFactoryImpl INSTANCE = new ManagerFactoryImpl();

    /**
     * Renvoie l'instance de la classe
     * @return {@link ManagerFactoryImpl}
     */
    static ManagerFactoryImpl getInstance(){
        return ManagerFactoryImpl.INSTANCE;
    }

    ProjetManager getProjetManager();

    void setProjetManager(ProjetManagerImpl pProjetManager);

    TicketManager getTicketManager();

    void setTicketManager(TicketManagerImpl pTicketManager);
}
