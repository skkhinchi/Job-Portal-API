package com.company.assginment.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.stereotype.Component;

import javax.persistence.*;


@Component
@Entity
@Table(name = "candidates")
public class Candidates {


    public Candidates() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "name")
    private String name;


    @Column(name = "mobile_no")
    private String mobileNo;


    @Column(name = "email")
    private String email;


    @Column(name = "city")
    private String canCity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCanCity() {
        return canCity;
    }

    public void setCanCity(String canCity) {
        this.canCity = canCity;
    }

    @Override
    public String toString() {
        return "Candidates{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", email='" + email + '\'' +
                ", canCity='" + canCity + '\'' +
                '}';
    }
}
