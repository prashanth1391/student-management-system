package com.codespring.studentmanagementsystem.repository;

import com.codespring.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {
}
