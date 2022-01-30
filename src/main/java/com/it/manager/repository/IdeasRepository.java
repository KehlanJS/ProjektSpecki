package com.it.manager.repository;

import com.it.manager.domain.IdeaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeasRepository extends JpaRepository<IdeaEntity, Long> {
}
