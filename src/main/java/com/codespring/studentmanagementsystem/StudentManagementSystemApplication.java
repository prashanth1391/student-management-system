package com.codespring.studentmanagementsystem;

import com.codespring.studentmanagementsystem.entity.Student;
import com.codespring.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student s1 = new Student("Prashanth","kumar","abc@gmail.com");
//		studentRepository.save(s1);
//		Student s2 = new Student("sanjay","yadav","sanjay@gmail.com");
//		studentRepository.save(s2);
//		Student s3 = new Student("tony","john","tony@gmail.com");
//		studentRepository.save(s3);
	}
}
