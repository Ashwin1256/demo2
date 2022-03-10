package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Response {
	
	@GetMapping("/appl/{name}")
	// adding new line file
	 ResponseEntity<String> getmessage(){
		 
		String name="";
		if(name.equals("abcd")) {
			
			return new ResponseEntity<>("not good "+name,HttpStatus.BAD_REQUEST);	
		}
		 	 
		 return new ResponseEntity<>("welcome to new page"+name,HttpStatus.OK);
		 
		 
	 }
	
	
	
	

}
