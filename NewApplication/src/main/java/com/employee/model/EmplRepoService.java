package com.employee.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmplRepoService {
	
	@Autowired
	EmplRepo em;
	@Autowired
	AdRepo ad;
	
	
	
	public List<Employee> getEmployee() {
		
		
		List<Employee> ls = em.findAll();
		
		
		return ls;
	}
	
	
	public void saveEmployee(Employee empl) {
		
		em.save(empl);
		
	}
	

	public void saveAddress(Address address) {
		
		ad.save(address);
		
	}
	
}
