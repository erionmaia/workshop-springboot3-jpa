package com.educandoweb.course_298.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course_298.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
