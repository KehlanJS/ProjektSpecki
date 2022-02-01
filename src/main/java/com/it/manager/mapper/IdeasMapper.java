package com.it.manager.mapper;

import com.it.manager.domain.IdeaEntity;
import com.it.manager.dto.IdeaDetailsDTO;
import com.it.manager.dto.RewardDetailsDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class IdeasMapper {

    private final RewardsMapper rewardsMapper;

    IdeaDetailsDTO toIdeaDetailsDto(IdeaEntity entity) {
        List<RewardDetailsDTO> rewards = entity.getRewards().stream()
            .map(rewardsMapper::toRewardsDetailsDto).collect(Collectors.toList());

        return IdeaDetailsDTO.builder()
            .description(entity.getDescription())
            .status(entity.getStatus())
            .rewards(rewards)
            .build();
    }
}
