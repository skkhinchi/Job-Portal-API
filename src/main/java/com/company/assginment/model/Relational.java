package com.company.assginment.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity

@Table(name = "canjobsmix")
public class Relational {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "cand_id")
    private int candId;

    @Column(name = "job_id")
    private int jobId;

    @Column(name = "status")
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCandId() {
        return candId;
    }

    public void setCandId(int canId) {
        this.candId = canId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Relational{" +
                "id=" + id +
                ", canId=" + candId +
                ", jobId=" + jobId +
                ", status='" + status + '\'' +
                '}';
    }
}
