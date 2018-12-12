package org.example.demo.ticket.consumer.impl.dao;

import javax.inject.Named;
import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;
import org.springframework.jdbc.core.JdbcTemplate;


@Named
public class TicketDaoImpl extends AbstractDaoImpl implements TicketDao {

    @Override
    public int getCountTicket(RechercheTicket pRechercheTicket) {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrTicket = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM ticket",
                Integer.class);

        return vNbrTicket;
    }
}