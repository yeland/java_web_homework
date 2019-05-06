package com.weilinxiao.homework.Dao;


import com.weilinxiao.homework.tool.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
