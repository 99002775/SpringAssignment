package com.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.dao.StudentRepository;
import com.studentapp.exception.StudentNotFoundException;
import com.studentapp.model.Student;

@Service

public class StudentServiceImpl implements StudentService {
	
	@Autowired
 StudentRepository studentRepository;
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Student getStudentById(Integer id) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentRepository.findById(id)
				.orElseThrow(()->new StudentNotFoundException("Student id not available"));
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		Student newStudent=studentRepository.save(student);
		return newStudent;
	}

	@Override
	public boolean deleteStudent(Integer id) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Student> getStudentByCity(String city) {
		// TODO Auto-generated method stub
		return studentRepository.findByAddressCity(city);
	}

	@Override
	public List<Student> getStudentByDepartment(String department) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentRepository.findByDepartment(department);

	}

	@Override
	public List<Student> findStudentByAge(Integer age)  throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentRepository.findByAge(age);
	}

}
