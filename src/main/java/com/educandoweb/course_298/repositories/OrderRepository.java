package com.educandoweb.course_298.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course_298.entities.Order;
import com.educandoweb.course_298.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
