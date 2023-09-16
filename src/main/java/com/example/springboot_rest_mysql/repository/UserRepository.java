package com.example.springboot_rest_mysql.repository;

import com.example.springboot_rest_mysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}