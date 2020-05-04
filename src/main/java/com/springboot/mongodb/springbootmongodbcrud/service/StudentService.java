/**
 * 
 */
package com.springboot.mongodb.springbootmongodbcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.mongodb.springbootmongodbcrud.document.Student;
import com.springboot.mongodb.springbootmongodbcrud.repository.StudentRepository;

/**
 * @author B0216853
 *
 */
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;

	public List<Student> findAll() {
		return studentRepo.findAll();
	}

	public Student findById(String stuId) {
		return studentRepo.findByStuId(stuId).get();
	}

	public Student saveorUpdateStudent(Student student) {
		return studentRepo.save(student);
	}

	public void deleteById(String studId) {
		studentRepo.deleteByStuId(studId);
	}

	public void deleteAll() {
		studentRepo.deleteAll();
	}

	public List<Student> saveAll(List<Student> stuList) {
		return studentRepo.saveAll(stuList);
	}
}
