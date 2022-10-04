package com.onetoone.hotelrooms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.onetoone.hotelrooms.model.Instructor;
 
@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long>{
 
}
