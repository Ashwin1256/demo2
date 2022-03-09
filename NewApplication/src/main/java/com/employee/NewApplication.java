package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.model.EmplRepo;
import com.employee.model.Employee;

@SpringBootApplication
public class NewApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NewApplication.class, args);
	}

	@Autowired
	EmplRepo em;

	@Override
	public void run(String... args) throws Exception {
	
		
	List<Employee> emplee =em.getEmpl("mumbai");
		
		System.out.println(emplee);
		
	}
	
	



	}


