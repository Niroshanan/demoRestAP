package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentRepository studentRepo;
    @Autowired
    StudentService studentService;

    @GetMapping("hello")
    public String hello() {
        return "Hello Niroshanan";
    }

    @GetMapping("details")
    public ResponseEntity<Student> details() {
        Student student = new Student();
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    @GetMapping("studentListByCity")
    public ResponseEntity<List<Student>> studentListByCity(@RequestParam String city) {
        return new ResponseEntity<>(studentService.getStudentByCity(city), HttpStatus.OK);
    }

    @RequestMapping("/form1")
    public String createForm(Model model){
        Student student =  new Student();
        model.addAttribute("student",student);
        return "form";
    }
    @GetMapping("studentList")
    public ResponseEntity<List<Student>> studentList() {

        return new ResponseEntity<>(studentService.getAllStudentList(), HttpStatus.OK);
    }
    @RequestMapping("/viewStudent")
    public String viewStudent(@ModelAttribute Student student,Model model){
        System.out.println(student.getName());
        System.out.println(student.getCity());
        System.out.println(student.getStudentNumber());
        return "view";
    }

    @PostMapping("/createStudent")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.saveStudent(student),HttpStatus.OK);
    }

}
