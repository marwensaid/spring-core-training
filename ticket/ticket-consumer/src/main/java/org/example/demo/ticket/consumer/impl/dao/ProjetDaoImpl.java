package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contrat.dao.ProjetDao;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.projet.Version;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.exception.TechnicalException;

import java.util.List;

public class ProjetDaoImpl implements ProjetDao{
    @Override
    public Projet getProjet(Integer pId) throws NotFoundException {
        return null;
    }

    @Override
    public List<Projet> getListProjet() {
        return null;
    }

    @Override
    public void insertVersion(Version pVersion) throws TechnicalException {

    }
}
