package org.example.demo.ticket.consumer.contrat;

public interface DaoFactory {
    ProjetDao getProjetDao();
    TicketDao getTicketDao();
}
