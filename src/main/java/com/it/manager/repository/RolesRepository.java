package com.it.manager.repository;

import com.it.manager.domain.IdeaEntity;
import com.it.manager.domain.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<RoleEntity, Long> {
}
