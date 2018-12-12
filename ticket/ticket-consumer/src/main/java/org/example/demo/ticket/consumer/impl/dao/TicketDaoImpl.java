package org.example.demo.ticket.consumer.impl.dao;

import javax.inject.Named;
import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;
import org.springframework.jdbc.core.JdbcTemplate;


@Named
public class TicketDaoImpl extends AbstractDaoImpl implements TicketDao {

    @Override
    public int getCountTicket(RechercheTicket pRechercheTicket) {
        String vSQL
                = "SELECT COUNT(*) FROM ticket"
                + " WHERE auteur_id = ?"
                + "   AND projet_id = ?";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrTicket = vJdbcTemplate.queryForObject(
                vSQL, Integer.class,
                pRechercheTicket.getAuteurId(),
                pRechercheTicket.getProjetId());

        return vNbrTicket;
    }
}