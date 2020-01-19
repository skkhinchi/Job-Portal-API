package com.company.assginment.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Set;


@Component
@Entity

@Table(name = "jobs")
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "post")
    private String post;

    @Column(name = "comp_id")
    private int compId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getCompId() {
        return compId;
    }

    public void setCompId(int compId) {
        this.compId = compId;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "job_id=" + id +
                ", post='" + post + '\'' +
                ", com_id=" + compId +
                '}';
    }
}
