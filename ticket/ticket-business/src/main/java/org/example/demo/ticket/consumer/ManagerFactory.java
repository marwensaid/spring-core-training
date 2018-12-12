package org.example.demo.ticket.consumer;

import org.example.demo.ticket.consumer.manager.ProjetManager;
import org.example.demo.ticket.consumer.manager.TicketManager;

/**
 * Created by ciara on 10/12/2018.
 */
public interface ManagerFactory {
    public ProjetManager getProjetManager();

    public TicketManager getTicketManager();

    public void setProjetManager(ProjetManager pProjetManager);

    public void setTicketManager(TicketManager tTicketManager);
}
