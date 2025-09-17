package com.example.university.service;

import com.example.university.dto.CourseDTO;
import com.example.university.dto.StudentDTO;
import com.example.university.entity.Course;
import com.example.university.entity.Professor;
import com.example.university.repository.CourseRepository;
import com.example.university.repository.ProfessorRepository;
import com.example.university.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UniversityService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final ProfessorRepository professorRepository;

    public UniversityService(StudentRepository studentRepository,
                             CourseRepository courseRepository,
                             ProfessorRepository professorRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.professorRepository = professorRepository;
    }

    // Get student with their courses & professor names
    public Optional<StudentDTO> getStudentWithCourses(Long id) {
        return studentRepository.findById(id)
                .map(student -> {
                    List<CourseDTO> courses = student.getCourses().stream()
                            .map(c -> {
                                String professorName = (c.getProfessor() != null) ? c.getProfessor().getName() : null;
                                return new CourseDTO(c.getId(),c.getName(), professorName);
                            })
                            .collect(Collectors.toList());

                    return new StudentDTO(student.getId(), student.getName(), courses);
                });
    }


    // Get all students with their courses
    public List<StudentDTO> getAllStudentsWithCourses() {
        return studentRepository.findAll().stream()
                .map(student -> new StudentDTO(
                        student.getId(),
                        student.getName(),
                        student.getCourses().stream()
                                .map(c -> {
                                    String professorName = (c.getProfessor() != null) ? c.getProfessor().getName() : null;
                                    return new CourseDTO(c.getId(), c.getName(), professorName);
                                })
                                .collect(Collectors.toList())
                ))
                .collect(Collectors.toList());
    }


    // Get all courses
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    // Get all professors
    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    // Get course by ID
    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    // Get professor by ID
    public Optional<Professor> getProfessorById(Long id) {
        return professorRepository.findById(id);
    }
}