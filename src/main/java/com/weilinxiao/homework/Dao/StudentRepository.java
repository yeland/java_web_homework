package com.example.demo.Dao;

import com.example.demo.tool.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
