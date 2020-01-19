package com.company.assginment.repository;

import com.company.assginment.model.Companies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Companies,Integer> {
}
