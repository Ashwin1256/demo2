package com.employee.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface EmplRepo extends JpaRepository<Employee, Integer> {
	
	@Query(value = "select * from Employee  join Address   where a.state = 'mumbai'", nativeQuery = true)
	public List<Employee> getEmpl(@Param("city") String city);
	

}
