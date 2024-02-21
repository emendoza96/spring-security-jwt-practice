package com.security.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.user.dao.UserRepository;
import com.security.user.domain.UserEntity;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    public UserEntity createUser(UserEntity user) {

        String encodedPass = passwordEncoder.encode(user.getPassword());
        System.err.println(encodedPass);
        user.setPassword(encodedPass);

        return userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    public List<UserEntity> getUsers(){
        return userRepository.findAll();
    }
}
