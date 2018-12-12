package org.example.demo.ticket.business;

import javax.inject.Inject;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

/**
 * Factory for ressource manager
 */
public class ManagerFactoryImpl implements ManagerFactory {

    @Inject
    private ProjetManager projetManager;

    @Inject
    private TicketManager ticketManager;

    @Override
    public ProjetManager getProjetManager() {
        return projetManager;
    }
    @Override
    public TicketManager getTicketManager() {
        return ticketManager;
    }

    @Override
    public void setProjetManager(ProjetManager vProjetManager) {
        this.projetManager = vProjetManager;
    }

    @Override
    public void setTicketManager(TicketManager vTicketManager) {
        this.ticketManager = vTicketManager;
    }
}