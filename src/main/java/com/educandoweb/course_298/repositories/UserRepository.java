package com.educandoweb.course_298.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course_298.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
