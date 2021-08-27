package com.byjohnjava.springsales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.byjohnjava.springsales.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
