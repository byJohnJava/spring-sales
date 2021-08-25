package com.byjohnjava.springsales.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.byjohnjava.springsales.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Joao", "joao@gmail.com", "11 94761-4880", "12345");
		return ResponseEntity.ok().body(u);
	}

}
