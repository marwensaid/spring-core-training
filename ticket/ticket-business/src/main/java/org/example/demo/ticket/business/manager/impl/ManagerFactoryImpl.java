package org.example.demo.ticket.business.manager.impl;

import org.example.demo.ticket.business.manager.myInterface.ManagerFactory;
import org.example.demo.ticket.business.manager.myInterface.ProjetManager;
import org.example.demo.ticket.business.manager.myInterface.TicketManager;

import javax.inject.Inject;

public class ManagerFactoryImpl implements ManagerFactory {

    @Inject
    private ProjetManager projetManager;

    @Inject
    private TicketManager ticketManager;

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
    public ProjetManager getProjetManager(){
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
    public TicketManager getTicketManager(){
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
