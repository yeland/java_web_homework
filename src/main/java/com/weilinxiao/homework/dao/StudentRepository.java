package com.weilinxiao.homework.dao;


import com.weilinxiao.homework.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
