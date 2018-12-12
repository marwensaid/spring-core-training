package org.example.demo.ticket.consumer.Impl.dao;

import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameterValue;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.logging.Logger;

@Named
public class TicketDaoImpl extends AbstractDaoImpl implements TicketDao {

    @Override
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

    @Override
    public List<TicketStatut> getListStatut() {
        String vSQL = "SELECT * FROM public.statut";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<TicketStatut> vRowMapper = new RowMapper<TicketStatut>() {
            public TicketStatut mapRow(ResultSet pRS, int pRowNum) throws SQLException {
                TicketStatut vTicketStatut = new TicketStatut(pRS.getInt("id"));
                vTicketStatut.setLibelle(pRS.getString("libelle"));
                return vTicketStatut;
            }
        };

        List<TicketStatut> vListStatut = vJdbcTemplate.query(vSQL, vRowMapper);

        return vListStatut;
    }

    public void updateTicketStatut(TicketStatut pTicketStatut) {
        String vSQL = "UPDATE statut SET libelle = ? WHERE id = ?";

        Object[] vParams = {
                new SqlParameterValue(Types.INTEGER, pTicketStatut.getId()),
                new SqlParameterValue(Types.VARCHAR, pTicketStatut.getLibelle()),
        };

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);
    }

    public void insertTicketStatut(TicketStatut pTicketStatut) {
        String vSQL = "INSERT INTO statut (id, libelle) VALUES (:id, :libelle)";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        BeanPropertySqlParameterSource vParams = new BeanPropertySqlParameterSource(pTicketStatut);
        vParams.registerSqlType("id", Types.INTEGER);
        vParams.registerSqlType("libelle", Types.VARCHAR);

        try {
            vJdbcTemplate.update(vSQL, vParams);
        } catch (DuplicateKeyException vEx) {
            System.out.println(vEx.getMessage());
        }
    }
}