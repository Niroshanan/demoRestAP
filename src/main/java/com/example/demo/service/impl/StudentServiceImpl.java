package com.example.demo.service.impl;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

//    @Override
//    public List<Student> studentList(String city) {
//
//        List<Student> studentList =  new ArrayList<>();
//        studentList.add(new Student("Niros","CS/2018/030","Colombo"));
//        studentList.add(new Student("Nive","CS/2018/040","Colombo"));
//        studentList.add(new Student("Ashaka","CS/2018/004","Tangalla"));
//        studentList.add(new Student("Rusiru","CS/2018/004","Tangalla"));
//        studentList.add(new Student("Ashen","CS/2018/004","Tangalla"));
//        studentList.add(new Student("Sanjula","CS/2018/006","Kandy"));
//
//        return studentList.stream().filter(student -> student.getCity().equals(city)).collect(Collectors.toList());
//    }


    @Override
    public List<Student> getStudentByCity(String city) {
        return studentRepository.findStudentByCity(city);
    }

    @Override
    public List<Student> getAllStudentList() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

}
