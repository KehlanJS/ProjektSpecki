package com.it.manager.domain;

import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Table(name = "Rewards")
public class RewardEntity {

    @Id
    @Column(name = "id_rewards", nullable = false)
    private Long id;

    @Column(name = "id_user")
    @JoinColumn(name = "id_user")
    Long userId;

    @Column(name = "id_idea")
    @JoinColumn(name = "id_idea")
    Long ideaId;

    @Column(name = "amount")
    BigDecimal amount;

    @Column(name = "reward_name")
    String rewardName;
}
