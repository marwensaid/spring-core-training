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

    @Override
    public ProjetManagerImpl getProjetManager(){
        return new ProjetManagerImpl();
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