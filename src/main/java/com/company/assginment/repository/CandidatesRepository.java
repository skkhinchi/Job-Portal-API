package com.company.assginment.repository;

import com.company.assginment.model.Candidates;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatesRepository extends CrudRepository<Candidates,Integer> {
}
