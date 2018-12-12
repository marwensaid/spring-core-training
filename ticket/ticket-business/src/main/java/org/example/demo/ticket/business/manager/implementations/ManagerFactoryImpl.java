package org.example.demo.ticket.business.manager.implementations;

import org.example.demo.ticket.business.manager.interfaces.ManagerFactory;
import org.example.demo.ticket.business.manager.interfaces.ProjetManager;
import org.example.demo.ticket.business.manager.interfaces.TicketManager;

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

    public void setProjetManager(ProjetManager projetManager)
    {
        this.projetManager = projetManager;
    }

    public void setTicketManager(TicketManager ticketManager)
    {
        this.ticketManager = ticketManager;
    }

}
