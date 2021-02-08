package com.infinity.onlineShopping.titanapplication.service;

import com.infinity.onlineShopping.titanapplication.model.Student;

public interface StudentService {

    Student save(Student student);
    Student fetchStudent(int id);

}
