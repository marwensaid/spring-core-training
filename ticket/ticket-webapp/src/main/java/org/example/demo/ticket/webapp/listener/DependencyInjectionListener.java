package org.example.demo.ticket.webapp.listener;

import org.example.demo.ticket.business.contract.ManagerFactory;
import org.example.demo.ticket.business.impl.manager.ManagerFactoryImpl;
import org.example.demo.ticket.business.impl.manager.ProjetManagerImpl;
import org.example.demo.ticket.business.impl.manager.TicketManagerImpl;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyInjectionListener implements ServletContextListener
{

    @Override
    public void contextInitialized(ServletContextEvent PservletContextEvent) {
        ManagerFactory vManagerFactory = new ManagerFactoryImpl();
        vManagerFactory.setProjetManager(new ProjetManagerImpl());
        vManagerFactory.setTicketManager(new TicketManagerImpl());
        AbstractResource.setManagerFactory(vManagerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

}
