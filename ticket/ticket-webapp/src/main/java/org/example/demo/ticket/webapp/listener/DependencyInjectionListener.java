package org.example.demo.ticket.webapp.listener;

import org.example.demo.ticket.business.manager.ManagerFactory;
import org.example.demo.ticket.business.manager.contract.manager.ProjetManager;
import org.example.demo.ticket.business.manager.contract.manager.TicketManager;
import org.example.demo.ticket.webapp.rest.resource.AbstractRessource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyInjectionListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //Création de l'instance de ManagerFactory
        ManagerFactory vmanagerFactory = new ManagerFactory();
        // On ajoute l'injection des Managers dans la ManagerFactory
        vmanagerFactory.setProjetManager(new ProjetManager());
        vmanagerFactory.setTicketManager(new TicketManager());
        //Injection de l'instance de Manager Factory dans la classe Abstract Ressource
        AbstractRessource.setManagerFactory(vmanagerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
