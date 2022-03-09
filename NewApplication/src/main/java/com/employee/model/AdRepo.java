package com.employee.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepo extends JpaRepository<Address, Integer> {

}
