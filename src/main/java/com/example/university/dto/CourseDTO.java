package com.example.university.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CourseDTO implements java.io.Serializable {
    private Long id;
    private String title;
    private String professorName;

    public CourseDTO(Long id, String title, String s) {
        this.id = id;
        this.title = title;
        this.professorName = s;
    }
}
