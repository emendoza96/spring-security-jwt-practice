package com.security.user.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.user.domain.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    public Optional<UserEntity> findByUsername(String username);

}
