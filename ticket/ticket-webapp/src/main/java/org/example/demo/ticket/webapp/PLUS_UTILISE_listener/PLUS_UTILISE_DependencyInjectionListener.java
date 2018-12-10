package org.example.demo.ticket.webapp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.example.demo.ticket.business.ManagerFactory;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

public class DependencyInjectionListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent pServletContextEvent) {
        // Creation de l'instance de ManagerFactory
        ManagerFactory vManagerFactory = new ManagerFactory();

        // On ajoute l'injection des Managers dans le ManagerFactory
        vManagerFactory.setProjetManager(new ProjetManager());
        vManagerFactory.setTicketManager(new TicketManager());
        
        // Injection de l'instance de ManagerFactory dans la classe AbstractResource
        AbstractResource.setManagerFactory(vManagerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent pServletContextEvent) {
        // NOP
    }
}