package org.example.demo.ticket.business.manager.impl;

public class ManagerFactoryImpl implements org.example.demo.ticket.business.manager.myInterface.ManagerFactory {

    private ProjetManagerImpl projetManager;
    private TicketManagerImpl ticketManager;

    /**
     * Constructeur de la classe
     */
    public ManagerFactoryImpl(){
        super();
    }

    /**
     * On renvoie l'attribut projetManager
     * @return
     */
    @Override
    public ProjetManagerImpl getProjetManager(){
        return projetManager;
    }

    /**
     * Ajout d'un setter pour l'attribut projetManager
     * @param pProjetManager
     */
    @Override
    public void setProjetManager(ProjetManagerImpl pProjetManager){
        projetManager = pProjetManager;
    }

    /**
     * On renvoie l'attribut ticketManager
     * @return
     */
    @Override
    public TicketManagerImpl getTicketManager(){
        return ticketManager;
    }

    /**
     * Ajout d'un setter pour l'attribut ticketManager
     * @param pTicketManager
     */
    @Override
    public void setTicketManager(TicketManagerImpl pTicketManager){
        ticketManager = pTicketManager;
    }
}
