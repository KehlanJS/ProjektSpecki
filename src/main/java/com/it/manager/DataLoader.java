package com.it.manager;

import com.it.manager.domain.RoleEntity;
import com.it.manager.domain.Roles;
import com.it.manager.repository.RolesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {

    private final RolesRepository rolesRepository;

    @Override
    public void run(ApplicationArguments args) {
        rolesRepository.save(new RoleEntity(Roles.ADMIN));
        rolesRepository.save(new RoleEntity(Roles.USER));
    }
}
