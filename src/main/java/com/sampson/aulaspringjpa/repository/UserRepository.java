package com.sampson.aulaspringjpa.repository;


import com.sampson.aulaspringjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
