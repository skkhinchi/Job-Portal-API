package com.company.assginment.service;

import com.company.assginment.model.Candidates;
import com.company.assginment.model.Companies;
import com.company.assginment.model.Jobs;
import com.company.assginment.repository.CandidatesRepository;
import com.company.assginment.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private Jobs jobs;

    public Jobs saveJobs(Jobs jobs) {
        return jobRepository.save(jobs);
    }

    public Object showJobs() {
        return jobRepository.findAll();
    }

    public List<Jobs> showPostDetails(String post) {
        return jobRepository.findAllByPost(post);
    }


}
