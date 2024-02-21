package com.security.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.user.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
