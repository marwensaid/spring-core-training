package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.manager.ManagerFactory;

public class AbstractRessource {
    private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }
    public static void setManagerFactory(ManagerFactory pManagerFactory) {
        managerFactory = pManagerFactory;
    }
}
