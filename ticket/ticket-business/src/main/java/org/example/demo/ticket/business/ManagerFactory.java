package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

//...
public final class ManagerFactory {
    /** Instance unique de la classe (design pattern Singleton) */
    private static final ManagerFactory INSTANCE = new ManagerFactory();

    /**
     * Constructeur.
     */
    private ManagerFactory() {
        super();
    }

    /**
     * Renvoie l'instance unique de la classe (design pattern Singleton).
     *
     * @return {@link ManagerFactory}
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
//...
}