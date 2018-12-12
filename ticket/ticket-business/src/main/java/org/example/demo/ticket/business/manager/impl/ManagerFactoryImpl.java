package org.example.demo.ticket.business.manager.impl;


import org.example.demo.ticket.business.contract.ManagerFactory;

public class ManagerFactoryImpl implements ManagerFactory {

    private ProjetManagerImpl projetManager;
    private TicketManagerImpl ticketManager;

    public ManagerFactoryImpl(){
        super();
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