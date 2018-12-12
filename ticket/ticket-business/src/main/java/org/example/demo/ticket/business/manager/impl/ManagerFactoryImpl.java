package org.example.demo.ticket.business.manager.impl;


import org.example.demo.ticket.business.contract.ManagerFactory;
import org.example.demo.ticket.business.contract.ProjetManager;
import org.example.demo.ticket.business.contract.TicketManager;

import javax.inject.Inject;

public class ManagerFactoryImpl implements ManagerFactory {

    @Inject
    private ProjetManager projetManager;
    @Inject
    private TicketManager ticketManager;


    public ManagerFactoryImpl(){
        super();
    }

    @Inject
    public  ManagerFactoryImpl(ProjetManager pProjetManager,
                               TicketManager pTicketManager) {
        this.projetManager = pProjetManager;
        this.ticketManager = pTicketManager;
    }

    @Override
    public ProjetManager getProjetManager(){
        return projetManager;
    }

    @Override
    public TicketManagerImpl getTicketManager(){
        return new TicketManagerImpl();
    }

    @Override
    @Inject
    public void setProjetManager(ProjetManagerImpl pProjetManager){
        projetManager = pProjetManager;
    }

    @Override
    @Inject
    public void setTicketManager(TicketManagerImpl pTicketManager) {
        ticketManager = pTicketManager;
    }
}