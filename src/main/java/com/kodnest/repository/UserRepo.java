package com.kodnest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
