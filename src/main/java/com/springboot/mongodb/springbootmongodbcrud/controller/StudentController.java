/**
 * 
 */
package com.springboot.mongodb.springbootmongodbcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongodb.springbootmongodbcrud.document.Student;
import com.springboot.mongodb.springbootmongodbcrud.service.StudentService;

/**
 * @author B0216853
 *
 */
//Added Comment in testbranch2
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/findAll")
	public List<Student> findAll() {
		return studentService.findAll();
	}

	@GetMapping("/findById")
	public Student findById(@RequestParam("stuId") String stuId) {
		System.out.println("****** "+stuId);
		return studentService.findById(stuId);
	}

	@PostMapping("/saveAll")
	public List<Student> saveAll(@RequestBody List<Student> students) {
		return studentService.saveAll(students);
	}

	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveorUpdateStudent(student);
	}

	@DeleteMapping("/deleteById")
	public void deleteById(@RequestParam String stuId) {
		studentService.deleteById(stuId);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAll() {
		studentService.deleteAll();
	}

}
