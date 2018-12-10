package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManagerImpl;
import org.example.demo.ticket.business.manager.TicketManagerImpl;

public class ManagerFactoryImpl implements ManagerFactory {


    private static final ManagerFactoryImpl INSTANCE = new ManagerFactoryImpl();

    private ProjetManagerImpl projetManager;

    private TicketManagerImpl ticketManager;

    private ManagerFactoryImpl() {
        super();
    }

    public static ManagerFactoryImpl getInstance() {
        return ManagerFactoryImpl.INSTANCE;
    }

    @Override
    public ProjetManagerImpl getProjetManager() {
        return projetManager;
    }

    @Override
    public void setProjetManager(ProjetManagerImpl pProjectManager) {
        projetManager = pProjectManager;
    }

    @Override
    public TicketManagerImpl getTicketManager() {
        return ticketManager;
    }

    @Override
    public void setTicketManager(TicketManagerImpl pTicketManager) {
        ticketManager = pTicketManager;
    }
}
