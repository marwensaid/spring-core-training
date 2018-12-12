package org.example.demo.ticket.consumer.impl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.inject.Named;

import org.example.demo.ticket.consumer.contract.dao.AbstractDaoImpl;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

@Named
public class TicketDaoImpl extends AbstractDaoImpl<Ticket> {


    public List<Ticket> getAll(){
        return new List<Ticket>;
    }
    public void updateTicketStatut(TicketStatut pTicketStatut) {
        String vSQL = "UPDATE statut SET libelle = :libelle WHERE id = :id";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(pTicketStatut);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        int vNbrLigneMaJ = vJdbcTemplate.update(vSQL, vParams);
    }


    public List<TicketStatut> getListStatut() {
        String vSQL = "SELECT * FROM public.statut";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<TicketStatut> vRowMapper = new TicketStatutRowMapper();

        List<TicketStatut> vListStatut = vJdbcTemplate.query(vSQL, vRowMapper);

        return vListStatut;
    }


    public int getCountTicket(RechercheTicket pRechercheTicket) {
        MapSqlParameterSource vParams = new MapSqlParameterSource();

        StringBuilder vSQL = new StringBuilder("SELECT COUNT(*) FROM ticket WHERE 1=1");

        if (pRechercheTicket != null) {
            if (pRechercheTicket.getAuteurId() != null) {
                vSQL.append(" AND auteur_id = :auteur_id");
                vParams.addValue("auteur_id", pRechercheTicket.getAuteurId());
            }
            if (pRechercheTicket.getProjetId() != null) {
                vSQL.append(" AND projet_id = :projet_id");
                vParams.addValue("projet_id", pRechercheTicket.getProjetId());
            }
        }

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        int vNbrTicket = vJdbcTemplate.queryForObject(vSQL.toString(), vParams, Integer.class);

        return vNbrTicket;
    }
}
