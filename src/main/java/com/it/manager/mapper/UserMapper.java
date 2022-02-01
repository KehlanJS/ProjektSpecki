package com.it.manager.mapper;

import com.it.manager.domain.RoleEntity;
import com.it.manager.domain.Roles;
import com.it.manager.domain.UserEntity;
import com.it.manager.dto.IdeaDetailsDTO;
import com.it.manager.dto.RewardDetailsDTO;
import com.it.manager.dto.UserDTO;
import com.it.manager.dto.UsersDetailsDTO;
import com.it.manager.repository.RolesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class UserMapper {
    private final RolesRepository rolesRepository;
    private final RewardsMapper rewardsMapper;
    private final IdeasMapper ideasMapper;

    public UserEntity toEntity(UserDTO dto) {
        final RoleEntity role = rolesRepository.findByRoleName(Roles.valueOf(dto.getRole())).get();

        return UserEntity.builder()
            .login(dto.getLogin())
            .password(dto.getPassword())
            .name(dto.getName())
            .surname(dto.getSurname())
            .role(role)
            .created(Instant.now())
            .build();
    }

    public UsersDetailsDTO toUserDetailsDTO(UserEntity userEntity) {
        List<RewardDetailsDTO> rewards = userEntity.getRewards().stream()
            .map(rewardsMapper::toRewardsDetailsDto).collect(Collectors.toList());

        List<IdeaDetailsDTO> ideas = userEntity.getIdeas().stream()
            .map(ideasMapper::toIdeaDetailsDto).collect(Collectors.toList());

        return UsersDetailsDTO.builder()
            .name(userEntity.getName())
            .surname(userEntity.getSurname())
            .login(userEntity.getLogin())
            .role(userEntity.getRole().getRoleName().toString())
            .ideas(ideas)
            .rewards(rewards)
            .created(userEntity.getCreated())
            .build();
    }
}
