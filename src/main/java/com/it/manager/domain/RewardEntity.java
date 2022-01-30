package com.it.manager.domain;

import javax.persistence.*;

@Entity
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
}
