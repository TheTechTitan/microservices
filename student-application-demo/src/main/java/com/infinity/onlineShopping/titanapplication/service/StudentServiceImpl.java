package com.infinity.onlineShopping.titanapplication.service;

import com.infinity.onlineShopping.titanapplication.model.Student;
import com.infinity.onlineShopping.titanapplication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    public Student save(Student student) {

        return studentRepository.save(student);
    }

    public Student fetchStudent(int id){

       Optional<Student> student= studentRepository.findById(id);
       if (student.isPresent()){
           return student.get();
       }

       return null;
    }
}
