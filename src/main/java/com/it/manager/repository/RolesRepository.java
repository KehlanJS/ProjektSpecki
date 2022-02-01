package com.it.manager.repository;

import com.it.manager.domain.RoleEntity;
import com.it.manager.domain.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolesRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByRoleName(Roles roleName);
}
