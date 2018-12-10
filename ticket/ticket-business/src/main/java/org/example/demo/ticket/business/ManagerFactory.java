package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public final class ManagerFactory {

    private static final ManagerFactory INSTANCE = new ManagerFactory();
    /**
     * Constructeur
     */
    private ManagerFactory() {
        super();
    }

    /**
     * renvoie l'instance unique de la classe (design pattern singleton)
     * @return
     */
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
