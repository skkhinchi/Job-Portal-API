package com.company.assginment.repository;

import com.company.assginment.model.Relational;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelationalRepository extends CrudRepository<Relational,Integer> {
    List<Relational> findAllByCandId(int id);

    List<Relational> findAllByJobId(int id);
}
