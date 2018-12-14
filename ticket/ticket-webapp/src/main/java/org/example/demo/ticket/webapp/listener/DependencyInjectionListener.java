package org.example.demo.ticket.webapp.listener;

import org.example.demo.ticket.business.manager.impl.ManagerFactoryImpl;
import org.example.demo.ticket.business.manager.impl.ProjetManagerImpl;
import org.example.demo.ticket.business.manager.impl.TicketManagerImpl;
import org.example.demo.ticket.business.manager.myInterface.ManagerFactory;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyInjectionListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //Creation de l'instance de ManagerFactoryImpl
        ManagerFactory vManagerFactory = new ManagerFactoryImpl();

        //On ajoute l'injection des Managers dans la ManagerFactoryImpl
        vManagerFactory.setProjetManager(new ProjetManagerImpl());
        vManagerFactory.setTicketManager(new TicketManagerImpl());

        //Injection de l'instance de ManagerFactoryImpl dans la classe AbstractResource
        AbstractResource.setManagerFactory(vManagerFactory);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        //NOP
    }
}
