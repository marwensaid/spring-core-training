package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.IManagerFactory;

public class AbstractResource {

    private static IManagerFactory managerFactory;

    protected static IManagerFactory getManagerFactory(){
        return AbstractResource.managerFactory;
    }

    public static void setManagerFactory(IManagerFactory pManagerFactoryImpl){
        managerFactory = pManagerFactoryImpl;
    }
}
