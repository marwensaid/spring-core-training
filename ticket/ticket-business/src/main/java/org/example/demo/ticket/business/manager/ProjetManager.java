package org.example.demo.ticket.business.manager;

import java.util.List;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;

public interface ProjetManager {
    public Projet getProjet(Integer pId) throws NotFoundException;
    public List<Projet> getListProjet();
}