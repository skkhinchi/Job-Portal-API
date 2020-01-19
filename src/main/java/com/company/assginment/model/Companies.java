package com.company.assginment.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "companies")
public class Companies {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "comp_name")
    private String compName;

    @Column(name = "comp_city")
    private String compCity;

    public int getCompId() {
        return id;
    }

    public void setCompId(int comId) {
        this.id = comId;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getCompCity() {
        return compCity;
    }

    public void setCompCity(String compCity) {
        this.compCity = compCity;
    }

    @Override
    public String toString() {
        return "Companies{" +
                "comId=" + id +
                ", compName='" + compName + '\'' +
                ", compCity='" + compCity + '\'' +
                '}';
    }
}
