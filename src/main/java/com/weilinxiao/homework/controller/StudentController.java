package com.example.demo.controller;

import com.example.demo.Dao.StudentRepository;
import com.example.demo.tool.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/students")
    public String save(Integer id, String name, int age, String sex) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        studentRepository.save(student);
        return "保存成功";
    }

    @DeleteMapping("/students/{id}")
    public String delete(@PathVariable("id") Integer id) {
        studentRepository.deleteById(id);
        return "删除成功";
    }
}
