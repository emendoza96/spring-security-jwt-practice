package com.security.user.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TestRoleController {

    @GetMapping("/accessAdmin")
    @PreAuthorize("hasRole('ADMIN')")
    public String accessAdmin() {
        return "Role: ADMIN";
    }

    @GetMapping("/accessUser")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public String accessUser() {
        return "Role: USER";
    }

    @GetMapping("/accessInvited")
    @PreAuthorize("hasAnyRole('INVITED', 'ADMIN')")
    public String accessInvited() {
        return "Role: INVITED";
    }
}
