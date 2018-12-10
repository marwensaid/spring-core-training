package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;
import org.example.demo.ticket.business.manager.TicketManagerImpl;

public class ManagerFactory {
    // ...

    // ProjetManager est désormais une interface.
    // La Factory dépend de cette interface et non pas de l'implémentation

    // Ajout d'un attribut projetManager
    private ProjetManager projetManager;
    private TicketManager ticketManager;

    // On renvoie désormais simplement l'attribut projetManager
    public ProjetManager getProjetManager() {
        return projetManager;
    }

    // Ajout d'un setter pour l'attribut projetManager
    public void setProjetManager(ProjetManager pProjetManager) {
        projetManager = pProjetManager;
    }

    public TicketManager getTicketManager() {
        return ticketManager;
    }

    public void setTicketManager(TicketManager pTicketManager) {
        ticketManager = pTicketManager;
    }

}