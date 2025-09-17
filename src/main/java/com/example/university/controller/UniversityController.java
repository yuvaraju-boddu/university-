package com.example.university.controller;

import com.example.university.dto.StudentDTO;
import com.example.university.entity.Course;
import com.example.university.entity.Professor;
import com.example.university.service.UniversityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/university")
public class UniversityController {

    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    // --- Students
    @GetMapping("/students")
    public List<StudentDTO> getAllStudents() {
        return universityService.getAllStudentsWithCourses();
    }

    @GetMapping("/students/{id}")
    public StudentDTO getStudentById(@PathVariable Long id) {
        return universityService.getStudentWithCourses(id).orElse(null);
    }

    // --- Courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return universityService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return universityService.getCourseById(id).orElse(null);
    }

    // --- Professors
    @GetMapping("/professors")
    public List<Professor> getAllProfessors() {
        return universityService.getAllProfessors();
    }

    @GetMapping("/professors/{id}")
    public Professor getProfessorById(@PathVariable Long id) {
        return universityService.getProfessorById(id).orElse(null);
    }
}
