package org.example.demo.ticket.business.manager.impl;


import org.example.demo.ticket.business.contract.ManagerFactory;

import javax.inject.Inject;

public class ManagerFactoryImpl implements ManagerFactory {

    @Inject
    private ProjetManagerImpl projetManager;

    @Inject
    private TicketManagerImpl ticketManager;

    public ManagerFactoryImpl(){
        super();
        //test
    }

    @Override
    public ProjetManagerImpl getProjetManager(){
        return projetManager;
    }

    @Override
    public TicketManagerImpl getTicketManager(){
        return new TicketManagerImpl();
    }

    @Override
    public void setProjetManager(ProjetManagerImpl pProjetManager){
        projetManager = pProjetManager;
    }

    @Override
    public void setTicketManager(TicketManagerImpl pTicketManager) {
        ticketManager = pTicketManager;
    }
}