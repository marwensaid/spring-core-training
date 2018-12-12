package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.business.contract.DAO.TicketDao;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.inject.Named;
import javax.sql.DataSource;

/**
 * Created by ciara on 12/12/2018.
 */
@Named
public class TicketDaoImpl extends AbstractDaoImpl implements TicketDao {

    @Override
    public int getCountTicker(RechercheTicket pRechercheTicket) {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate((DataSource) getDataSource());
        int vNbrTicket = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM ticket",
                Integer.class
        );
        return vNbrTicket;
    }
}
