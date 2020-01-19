package com.company.assginment.controller;

import com.company.assginment.model.Candidates;
import com.company.assginment.model.Companies;
import com.company.assginment.model.Jobs;
import com.company.assginment.model.Relational;
import com.company.assginment.repository.JobRepository;
import com.company.assginment.service.CandidateService;
import com.company.assginment.service.CompanyService;
import com.company.assginment.service.JobService;
import com.company.assginment.service.RelationalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@RestController
public class AppController {

    @Autowired
    private Candidates candidates;

    @Autowired
    private Companies companies;

    @Autowired
    private Jobs jobs;
    @Autowired
    private Relational relational;

    @Autowired
    private RelationalService relationalService;

    @Autowired
    private JobService jobService;

    @Autowired
    private CandidateService candidateService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private JobRepository jobRepository;


    @ResponseBody
    @RequestMapping("/")
    public String hello() {
        return "Hello ! Sucessfully Login .....";
    }
    

    @PostMapping("/save-candidates")
    public Candidates save(@RequestBody Candidates candidates) {
        return candidateService.saveMethod(candidates);
    }
    @PutMapping("/update-candidates")
    public Candidates update(@RequestBody Candidates candidates) {
        return candidateService.saveMethod(candidates);

    }
    @GetMapping("/show-candidates")
    public List<Candidates> showAllCandidates() {
        return (List<Candidates>) candidateService.showAllCandidates();
    }

    @ResponseBody
    @GetMapping("/show-candidate-details")
    public <Optional> java.util.Optional<Candidates> showCandidate(@RequestParam int id) {
        java.util.Optional<Candidates> candidates = candidateService.showCandidateDetails(id);
        return candidates;
    }

    @GetMapping("/show-companies")
    public List<Companies> showAllCompanies() {
        return (List<Companies>) companyService.showAllCompanies();
    }

    @PostMapping("/save-companies")
    public Companies saveCompany(@RequestBody Companies companies) {
        return companyService.saveMethodCompany(companies);
    }

    @PutMapping("/update-companies")
    public Companies updateCompany(@RequestBody Companies companies) {
        return companyService.saveMethodCompany(companies);
    }

    @ResponseBody
    @GetMapping("/show-company-details-by-ID")
    public <Optional> java.util.Optional<Companies> showCompany(@RequestParam int id) {
        java.util.Optional<Companies> companies = companyService.showCompanyDetails(id);
        return companies;
    }

    @GetMapping("/show-jobs")
    public List<Jobs> showAllJobs() {
        return (List<Jobs>) jobService.showJobs();
    }

    @PostMapping("/save-jobs")
    public Jobs saveJobs(@RequestBody Jobs jobs) {
        return jobService.saveJobs(jobs);
    }

    @PutMapping("/update-jobs")
    public Jobs updateJobs(@RequestBody Jobs jobs) {
        return jobService.saveJobs(jobs);
    }

    @ResponseBody
    @GetMapping("/show-post-details")
    public List<Jobs> showPosts(@RequestParam String post) {
        List<Jobs> jobs = null;
        jobs = jobRepository.findAllByPost(post);
        return jobs;
    }

    @GetMapping("/show-Relational")
    public List<Relational> showAllRelational() {
        return (List<Relational>) relationalService.showRelational();
    }
    @PostMapping("/save-Relational")
    public Relational saveRelational(@RequestBody Relational relational) {
        return relationalService.saveRelational(relational);
    }

    @PutMapping("/update-Jobs-Status")
    public Relational update(@RequestBody Relational relational) {
        return relationalService.updateJobsStatus(relational);
    }

    @ResponseBody
    @GetMapping("/show-Candidate-Job-details-by-ID-which-he-applied")
    public List<Relational> showCandJobStatus(@RequestParam int id) {
        List<Relational> relational = null;
        relational = relationalService.showCandJobsStatus(id);
        return relational;
    }

    @ResponseBody
    @GetMapping("Show-candidates-id-by-job-id-which-they-have-applied")
    public List<Relational> showCandByJob(@RequestParam int id) {
        List<Relational> relational = null;
        relational = relationalService.showCandsByJob(id);
        return relational;
    }


}
