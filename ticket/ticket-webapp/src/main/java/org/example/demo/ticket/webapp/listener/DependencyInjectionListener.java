package org.example.demo.ticket.webapp.listener;

import org.example.demo.ticket.business.manager.implementations.ManagerFactoryImpl;
import org.example.demo.ticket.business.manager.implementations.ProjetManagerImpl;
import org.example.demo.ticket.business.manager.implementations.TicketManagerImpl;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyInjectionListener implements ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent)
    {
        ManagerFactoryImpl managerFactory = new ManagerFactoryImpl();
        managerFactory.setProjetManager(new ProjetManagerImpl());
        managerFactory.setTicketManager(new TicketManagerImpl());

        AbstractResource.setManagerFactory(managerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent)
    {
        //lel
    }
}
