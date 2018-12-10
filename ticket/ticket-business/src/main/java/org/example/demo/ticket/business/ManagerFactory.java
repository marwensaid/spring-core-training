package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public class ManagerFactory implements ManagerFactoryImpl {


    private static final ManagerFactory INSTANCE = new ManagerFactory();

    private ProjetManager projetManager;

    private TicketManager ticketManager;

    private ManagerFactory() {
        super();
    }

    public static ManagerFactory getInstance() {
        return ManagerFactory.INSTANCE;
    }

    @Override
    public ProjetManager getProjetManager() {
        return projetManager;
    }

    @Override
    public void setProjetManager(ProjetManager pProjectManager) {
        projetManager = pProjectManager;
    }

    @Override
    public TicketManager getTicketManager() {
        return ticketManager;
    }

    @Override
    public void setTicketManager(TicketManager pTicketManager) {
        ticketManager = pTicketManager;
    }
}
