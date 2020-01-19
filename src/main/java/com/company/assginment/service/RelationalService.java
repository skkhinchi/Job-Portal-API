package com.company.assginment.service;

import com.company.assginment.model.Relational;
import com.company.assginment.repository.RelationalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationalService {
    @Autowired
    private Relational relational;

    @Autowired
    private RelationalRepository relationalRepository;



    public Relational updateJobsStatus(Relational relational) {
        return relationalRepository.save(relational);
    }

    public Object showRelational() {
        return relationalRepository.findAll();
    }


    public List<Relational> showCandJobsStatus(int id) {

        List<Relational> relationalServices= relationalRepository.findAllByCandId(id);
                return relationalServices;
    }

    public List<Relational> showCandsByJob(int id) {
        return relationalRepository.findAllByJobId(id);
    }

    public Relational saveRelational(Relational relational) {
        return relationalRepository.save(relational);
    }
}
