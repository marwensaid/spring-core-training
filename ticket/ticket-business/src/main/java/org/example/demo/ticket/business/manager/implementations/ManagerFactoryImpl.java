package org.example.demo.ticket.business.manager.implementations;

import org.example.demo.ticket.business.manager.interfaces.ManagerFactory;
import org.example.demo.ticket.business.manager.interfaces.ProjetManager;
import org.example.demo.ticket.business.manager.interfaces.TicketManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("managerFactory")
public class ManagerFactoryImpl implements ManagerFactory
{
    @Autowired
    private ProjetManager projetManager;

    @Autowired
    private TicketManager ticketManager;

    public ProjetManager getProjetManager()
    {
        return projetManager;
    }

    public TicketManager getTicketManager()
    {
        return ticketManager;
    }

    public void setProjetManager(ProjetManager projetManager)
    {
        this.projetManager = projetManager;
    }

    public void setTicketManager(TicketManager ticketManager)
    {
        this.ticketManager = ticketManager;
    }

}
