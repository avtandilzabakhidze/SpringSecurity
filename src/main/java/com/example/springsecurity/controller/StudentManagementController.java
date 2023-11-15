package com.example.springsecurity.controller;

import com.example.springsecurity.domain.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/students")
public class StudentManagementController {
    private static List<Student> STUDENTS = Arrays.asList(
            new Student(1L, "nik mori"),
            new Student(2L, "mik li")
    );

    @GetMapping
    public List<Student> getSTUDENTS() {
        System.out.println("getAllStudents");
        return STUDENTS;
    }

    @PostMapping
    public void createStudent(@RequestBody Student student) {
        System.out.println(student);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable Long id) {
        System.out.println(id);
    }

    @PutMapping
    public void updateStudent(@PathVariable Long id, @RequestBody Student student) {
        System.out.printf("%s %s", id, student);
    }
}
