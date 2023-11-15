package com.example.springsecurity.controller;

import com.example.springsecurity.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    private static List<Student> STUDENTS = Arrays.asList(
            new Student(1L, "nik mori"),
            new Student(2L, "mik li")
    );

    @GetMapping("{id}")
    public Student getStudentById(@PathVariable Long id) {
        return STUDENTS.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst().orElseThrow(() -> new IllegalStateException("Student " + id));
    }
}
