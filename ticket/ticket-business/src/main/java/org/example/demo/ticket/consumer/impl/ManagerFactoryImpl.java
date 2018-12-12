package org.example.demo.ticket.consumer.impl;

import org.example.demo.ticket.consumer.ManagerFactory;
import org.example.demo.ticket.consumer.manager.ProjetManager;
import org.example.demo.ticket.consumer.manager.TicketManager;
import javax.inject.Inject;

/**
 * Created by ciara on 10/12/2018.
 */
public class ManagerFactoryImpl implements ManagerFactory {

    private static final ManagerFactoryImpl INSTANCE = new ManagerFactoryImpl();
    @Inject
    private ProjetManager projetManager;

    @Inject
    private TicketManager ticketManager;

    @Override
    public ProjetManager getProjetManager(){
        return projetManager;
    }

    @Override
    public TicketManager getTicketManager(){
        return ticketManager;
    }

    @Override
    public void setProjetManager(ProjetManager pProjetManager) {
        projetManager = pProjetManager;
    }

    @Override
    public void setTicketManager(TicketManager tTicketManager) {
        ticketManager = tTicketManager;
    }

    /**
     * Renvoie l'instance unique de la classe(design pattern Singleton)
     * @return {@link ManagerFactoryImpl}
     */
    public static ManagerFactoryImpl getInstance() {
        return ManagerFactoryImpl.INSTANCE;
    }
}
