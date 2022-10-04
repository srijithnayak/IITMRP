package com.onetoone.hotelrooms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "client_detail")
public class InstructorDetails {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
 
    @Column(name = "Address")
    private String Address;
 
    @Column(name = "Proof")
    private String Proof;
 
    public InstructorDetails() {
 
    }
 
    public InstructorDetails(String Address, String Proof) {
        this.Address = Address;
        this.Proof = Proof;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getAddress() {
        return Address;
    }
 
    public void setAddress(String Address) {
        this.Address = Address;
    }
 
    public String getProof() {
        return Proof;
    }
 
    public void setProof(String Proof) {
        this.Proof = Proof;
    }
}
