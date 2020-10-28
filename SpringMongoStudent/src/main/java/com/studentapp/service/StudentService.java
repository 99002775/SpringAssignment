package com.studentapp.service;

import java.util.List;

import com.studentapp.model.Student;

public interface StudentService {
	Student getStudentById(Integer id);
	Student addStudent(Student student);
	boolean deleteStudent(Integer id);
	List<Student> getStudentByCity(String city);
	List<Student> getStudentByDepartment(String department);
	List<Student> findStudentByAge(Integer age);

}
