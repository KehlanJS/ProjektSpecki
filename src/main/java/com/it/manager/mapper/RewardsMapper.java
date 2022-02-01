package com.it.manager.mapper;

import com.it.manager.domain.RewardEntity;
import com.it.manager.dto.RewardDetailsDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RewardsMapper {

    RewardDetailsDTO toRewardsDetailsDto(RewardEntity entity) {
        return RewardDetailsDTO.builder()
            .rewardName(entity.getRewardName())
            .amount(entity.getAmount())
            .build();
    }
}
