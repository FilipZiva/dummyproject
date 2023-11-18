package org.example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Model.Persistance.StatusDao;
import org.example.Model.Service.StatusService;
import org.example.Model.Util.HibernateConnection;
import org.hibernate.SessionFactory;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    private static StatusService statusService;


    public static void main(String[] args) {
        SessionFactory connection = HibernateConnection.getSessionFactory();
        StatusDao statusDao = new StatusDao(connection);
        statusService = new StatusService(statusDao);
        initClasses();
        logger.log(Level.ERROR, statusService.getAllStatuses());
    }

    public static void initClasses() {
        statusService.initStatus();
    }
}