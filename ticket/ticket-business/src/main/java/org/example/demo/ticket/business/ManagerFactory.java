package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public interface ManagerFactory {
    public ProjetManager getProjetManager();
    public void setProjetManager(ProjetManager vProjetManager);
    public TicketManager getTicketManager();
    public void setTicketManager(TicketManager vTicketManager);
}