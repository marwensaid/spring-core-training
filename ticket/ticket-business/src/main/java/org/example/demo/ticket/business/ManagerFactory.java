package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;
import org.example.demo.ticket.model.bean.projet.Projet;

public class ManagerFactory {

    private static final ManagerFactory INSTANCE = new ManagerFactory();

    private ProjetManager projetManager;

    private TicketManager ticketManager;

    public ManagerFactory() {
        super();
    }

    public static ManagerFactory getInstance() {
        return ManagerFactory.INSTANCE;
    }

    public ProjetManager getProjetManager() {
        return projetManager;
    }

    public void setProjetManager(ProjetManager pProjectManager) {
        projetManager = pProjectManager;
    }

    public TicketManager getTicketManager() {
        return ticketManager;
    }

    public void setTicketManager(TicketManager pTicketManager) {
        ticketManager = pTicketManager;
    }
}
