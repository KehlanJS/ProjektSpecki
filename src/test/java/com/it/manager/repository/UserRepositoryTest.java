package com.it.manager.repository;

import com.it.manager.domain.RoleEntity;
import com.it.manager.domain.Roles;
import com.it.manager.domain.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;
import java.util.ArrayList;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @Test
    public void test() {
        var duparola = rolesRepository.save(new RoleEntity(Roles.ADMIN));
        userRepository.save(new UserEntity("dupa", "cyce", Instant.now(), "hehe", "password",
                new ArrayList<>(), new ArrayList<>(), duparola));
    }

}