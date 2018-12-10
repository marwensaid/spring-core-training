package org.example.demo.ticket.business;


public class ManagerFactory {

    // Ajout d'un attribut projetManager
    private ProjetManager projetManager;

    // On renvoie désormais simplement l'attribut projetManager
    public ProjetManager getProjetManager() {
        //return new ProjetManager();
        return projetManager;
    }

    // Ajout d'un setter pour l'attribut projetManager
    public void setProjetManager(ProjetManager pProjetManager) {
        projetManager = pProjetManager;
    }


    // Ajout d'un attribut TicketManager
    private TicketManager ticketManager;

    // On renvoie désormais simplement l'attribut ticketManager
    public TicketManager getTicketManager() {
        //return new TicketManager();
        return ticketManager;
    }

    // Ajout d'un setter pour l'attribut ticketManager
    public void setTicketManager(ticket tTicketManager) {
        ticketManager = tTicketManager;
    }

}
