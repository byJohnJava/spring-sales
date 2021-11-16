package com.byjohnjava.springsales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byjohnjava.springsales.entities.Category;
import com.byjohnjava.springsales.entities.User;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
