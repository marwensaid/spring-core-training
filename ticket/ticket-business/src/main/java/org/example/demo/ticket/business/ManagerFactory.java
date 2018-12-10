package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public final class ManagerFactory {

    private static final ManagerFactory INSTANCE = new ManagerFactory();

    //Ajout d'un attribut projectManager
    private ProjetManager projetManager;

    //Ajout d'un attribut ticketManager
    private TicketManager ticketManager;

    /**
     * Constructeur
     */
    public ManagerFactory() {
        super();
    }

    /**
     * renvoie l'instance unique de la classe (design pattern singleton)
     * @return
     */
    public static ManagerFactory getInstance() {
        return ManagerFactory.INSTANCE;
    }

    /**
     * On  renvoie désormais simplement l'attribut projectManager
     */
    public ProjetManager getProjetManager() {
        return projetManager;
    }

    /**
     * Ajout d'un setter pour l'attribut projetMnager
     * @return
     */
    public void setProjetManager(ProjetManager pProjetManager) {
        projetManager = pProjetManager;
    }

    public TicketManager getTicketManager() {
        return ticketManager;
    }

    public void setTicketManager(TicketManager tTicketManager) {
        ticketManager = tTicketManager;
    }
}
