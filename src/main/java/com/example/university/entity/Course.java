package com.example.university.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Many courses belong to one student
    @ManyToOne
    @JoinColumn(name = "student_id")
    @JsonBackReference
    private Student student;

    // Many courses are taught by one professor
    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }
}
