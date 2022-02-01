package com.it.manager.dto;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RewardDetailsDTO {
    String rewardName;
    BigDecimal amount;
}
