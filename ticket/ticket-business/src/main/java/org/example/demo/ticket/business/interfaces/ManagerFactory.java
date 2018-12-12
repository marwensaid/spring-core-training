package org.example.demo.ticket.business.interfaces;

public interface ManagerFactory
{
    ProjetManager getProjetManager();
    TicketManager getTicketManager();

    void setProjetManager(ProjetManager projetManager);
    void setTicketManager(TicketManager ticketManager);
}
