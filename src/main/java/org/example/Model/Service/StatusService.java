package org.example.Model.Service;

import org.example.Model.Domain.Status;
import org.example.Model.Persistance.StatusDao;

import javax.annotation.PostConstruct;
import java.util.List;

public class StatusService {

    private final StatusDao statusDao;

    public StatusService(StatusDao statusDao) {
        this.statusDao = statusDao;
    }

    public Status getStatus(Long id) {
        return statusDao.findById(id);
    }

    public List<Status> getAllStatuses() {
        return statusDao.findAll();
    }

    public void createStatus(Status status) {
        statusDao.saveOrUpdate(status);
    }

    @PostConstruct
    public void initStatus(){
        Status status = new Status();
        status.setName("High");
        createStatus(status);
    }

}

