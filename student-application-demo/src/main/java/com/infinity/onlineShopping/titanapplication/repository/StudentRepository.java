package com.infinity.onlineShopping.titanapplication.repository;

import com.infinity.onlineShopping.titanapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;


public interface StudentRepository extends JpaRepository<Student,Integer> {

    //Student save(Student student);
}
