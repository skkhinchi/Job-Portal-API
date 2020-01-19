package com.company.assginment.repository;

import com.company.assginment.model.Jobs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends CrudRepository<Jobs,Integer> {

    List<Jobs> findAllByPost(String post);
}