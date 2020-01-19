package com.company.assginment.service;

import com.company.assginment.model.Candidates;
import com.company.assginment.model.Companies;
import com.company.assginment.repository.CandidatesRepository;
import com.company.assginment.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private Companies companies;


    public Object showAllCompanies() {
        return companyRepository.findAll();

    }

    public Companies saveMethodCompany(Companies companies) {
        return companyRepository.save(companies);
    }

    public Optional<Companies> showCompanyDetails(int id) {
        return companyRepository.findById(id);
    }

}
