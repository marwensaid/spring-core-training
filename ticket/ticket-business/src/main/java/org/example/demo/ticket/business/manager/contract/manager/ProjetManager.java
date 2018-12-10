package org.example.demo.ticket.business.manager.contract.manager;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface ProjetManager {

    Projet getProjet(Integer pID) throws NotFoundException;

    List<Projet> getListProjet();
}
