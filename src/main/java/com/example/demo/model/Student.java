package com.example.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    @NotNull
    @Size(max =20)
    private String name;
    @Email
    @Size(max = 50)
    private String email;

    @NotBlank(message = "mobileNumber is required")
    @Size(min = 10, max = 10)
    public String mobileNumber;
    @NotNull
    private String studentNumber;
    @NotNull
    private String city;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Student() {
    }

    public Student(String name, String email, String mobileNumber, String studentNumber, String city) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.studentNumber = studentNumber;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
