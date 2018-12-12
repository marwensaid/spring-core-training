package org.example.demo.ticket.consumer.manager;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

/**
 * Created by ciara on 10/12/2018.
 */
public interface ProjetManager {
    public Projet getProjet(Integer pId) throws NotFoundException;

    public List<Projet> getListProjet();
}
