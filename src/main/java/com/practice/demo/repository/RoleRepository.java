package com.practice.demo.repository;

import com.practice.demo.entitiy.Role;
import com.practice.demo.entitiy.RoleEnum;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, Long> {
    Optional<Role> findByName(RoleEnum name);
}
