package com.company.assginment.service;

import com.company.assginment.model.Candidates;
import com.company.assginment.repository.CandidatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CandidateService {

    @Autowired
    private CandidatesRepository candidatesRepository;

    @Autowired
    private Candidates candidates;

    public Candidates saveMethod(Candidates candidates) {
        return candidatesRepository.save(candidates);
    }

    public Object showAllCandidates() {
        return candidatesRepository.findAll();
    }

    public Optional<Candidates> showCandidateDetails(Integer id) {
        return candidatesRepository.findById(id);
    }
}
