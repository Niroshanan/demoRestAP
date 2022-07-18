package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> getStudentByCity(String city);
    List<Student> getAllStudentList();

    Student saveStudent(Student student);

}
