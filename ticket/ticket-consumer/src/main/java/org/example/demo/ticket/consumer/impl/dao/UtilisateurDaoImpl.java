package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.AbstractDaoImpl;
import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UtilisateurDaoImpl extends AbstractDaoImpl<Utilisateur> {

    @Override
    public List<Utilisateur> getAll(){
        String vSQL = "SELECT * FROM public.utilisateur";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<TicketStatut> vRowMapper = new TicketStatutRowMapper();

        List<Utilisateur> vListStatut = vJdbcTemplate.query(vSQL, vRowMapper);

        return vListStatut;
    }

    public Utilisateur get(){
        return new Utilisateur();
    }
}
