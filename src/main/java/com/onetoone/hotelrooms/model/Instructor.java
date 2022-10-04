package com.onetoone.hotelrooms.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
@Entity
@Table(name = "hotelroom")
public class Instructor {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
 
    @Column(name = "hotelname")
    private String hotelName;
 
    @Column(name = "room_id")
    private int roomId;
 
    @Column(name = "clientname")
    private String clientname;
 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_detail_id")
    private InstructorDetails instructorDetail;
 
    public Instructor() {
 
    }
 
    public Instructor(String hotelName, int roomId, String clientname) {
        this.hotelName = hotelName;
        this.roomId = roomId;
        this.clientname = clientname;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String gethotelName() {
        return hotelName;
    }
 
    public void sethotelName(String hotelName) {
        this.hotelName = hotelName;
    }
 
    public int getroomId() {
        return roomId;
    }
 
    public void setroomId(int roomId) {
        this.roomId = roomId;
    }
 
    public String getclientname() {
        return clientname;
    }
 
    public void setclientname(String clientname) {
        this.clientname = clientname;
    }
 
    public InstructorDetails getInstructorDetail() {
        return instructorDetail;
    }
 
    public void setInstructorDetail(InstructorDetails instructorDetail) {
        this.instructorDetail = instructorDetail;
    }
}

