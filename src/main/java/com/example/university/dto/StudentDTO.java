package com.example.university.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data   // generates getters, setters, toString, equals, hashCode
@NoArgsConstructor
public class StudentDTO implements java.io.Serializable {
    private Long id;
    private String name;
    private List<CourseDTO> courses;

    public <R> StudentDTO(Long id, String name, R collect) {
        this.id = id;
        this.name = name;
        this.courses = (List<CourseDTO>) collect;
    }
}
