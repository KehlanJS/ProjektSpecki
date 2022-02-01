package com.it.manager.service;

import com.it.manager.dto.UserDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void registerUser() {
        userService.registerUser(new UserDTO("XXX", "xx", "12x", "123", "ADMIN"));
    }
}
