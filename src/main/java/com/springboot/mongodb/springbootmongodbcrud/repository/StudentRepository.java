/**
 * 
 */
package com.springboot.mongodb.springbootmongodbcrud.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.mongodb.springbootmongodbcrud.document.Student;

/**
 * @author B0216853
 *
 */
public interface StudentRepository extends MongoRepository<Student, String> {

	Optional<Student> findByStuId(String stuId);

	void deleteByStuId(String studId);

}
