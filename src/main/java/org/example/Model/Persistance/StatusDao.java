package org.example.Model.Persistance;

import org.example.Model.Domain.Status;
import org.hibernate.SessionFactory;

public class StatusDao extends GenericDao<Status> {
    public StatusDao(SessionFactory sessionFactory) {
        super(sessionFactory, Status.class);
    }
}
