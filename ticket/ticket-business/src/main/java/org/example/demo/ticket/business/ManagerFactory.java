package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public class ManagerFactory {

    private static final ManagerFactory INSTANCE = new ManagerFactory();

    private ManagerFactory() {
        super();
    }

    public static ManagerFactory getInstance() {
        return ManagerFactory.INSTANCE;
    }

    public ProjetManager getProjetManager() {
        return new ProjetManager();
    }

    public TicketManager getTicketManager() {
        return new TicketManager();
    }
}
