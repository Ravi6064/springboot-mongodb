/**
 * 
 */
package com.springboot.mongodb.springbootmongodbcrud.document;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author B0216853
 *
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private String stuId;
	private String name;
	private String age;
	private String gender;

}
