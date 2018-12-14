package org.example.demo.ticket.consumer.contrat.dao;

public interface DaoFactory {
    ProjetDao getProjetDao();
    TicketDao getTicketDao();
}
