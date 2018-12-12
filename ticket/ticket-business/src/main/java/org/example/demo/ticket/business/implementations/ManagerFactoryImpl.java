package org.example.demo.ticket.business.implementations;

import org.example.demo.ticket.business.interfaces.ManagerFactory;
import org.example.demo.ticket.business.interfaces.ProjetManager;
import org.example.demo.ticket.business.interfaces.TicketManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("managerFactory")
public class ManagerFactoryImpl implements ManagerFactory
{
    private ProjetManager projetManager;
    private TicketManager ticketManager;

    public ProjetManager getProjetManager()
    {
        return projetManager;
    }


    public TicketManager getTicketManager()
    {
        return ticketManager;
    }

    @Autowired
    public void setProjetManager(ProjetManager projetManager)
    {
        this.projetManager = projetManager;
    }

    @Autowired
    public void setTicketManager(TicketManager ticketManager)
    {
        this.ticketManager = ticketManager;
    }
}
