package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public final class ManagerFactoryImpl implements ManagerFactory {

    private static final ManagerFactoryImpl INSTANCE = new ManagerFactoryImpl();

    //Ajout d'un attribut projectManager
    private ProjetManager projetManager;

    //Ajout d'un attribut ticketManager
    private TicketManager ticketManager;

    /**
     * Constructeur
     */
    public ManagerFactoryImpl() {
        super();
    }

    /**
     * renvoie l'instance unique de la classe (design pattern singleton)
     * @return
     */
    public static ManagerFactoryImpl getInstance() {
        return ManagerFactoryImpl.INSTANCE;
    }

    /**
     * On  renvoie désormais simplement l'attribut projectManager
     */
    @Override
    public ProjetManager getProjetManager() {
        return projetManager;
    }

    /**
     * Ajout d'un setter pour l'attribut projetMnager
     * @return
     */
    @Override
    public void setProjetManager(ProjetManager pProjetManager) {
        projetManager = pProjetManager;
    }

    @Override
    public TicketManager getTicketManager() {
        return ticketManager;
    }

    @Override
    public void setTicketManager(TicketManager tTicketManager) {
        ticketManager = tTicketManager;
    }
}
