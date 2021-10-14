package com.byjohnjava.springsales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byjohnjava.springsales.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
