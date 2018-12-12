package org.example.demo.ticket.consumer.impl.rowmapper;

import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TicketStatusRowMapper implements RowMapper<TicketStatut> {
    public TicketStatut mapRow(ResultSet pRS, int pRowNum) throws SQLException {
        TicketStatut vTicketStatut = new TicketStatut(pRS.getInt("id"));
        vTicketStatut.setLibelle(pRS.getString("libelle"));
        return vTicketStatut;
    }
}
