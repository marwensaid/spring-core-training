package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.manager.implementations.ManagerFactoryImpl;

public class AbstractResource
{
    private static ManagerFactoryImpl managerFactory;

    protected static ManagerFactoryImpl getManagerFactory()
    {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactoryImpl managerFactory)
    {
        this.managerFactory = managerFactory;
    }
}
