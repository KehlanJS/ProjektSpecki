package com.it.manager.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "Ideas")
public class IdeaEntity {

    @Id
    @Column(name = "id_idea", nullable = false)
    private Long id;

    @Column(name = "id_rewards", nullable = false)
    private String rewardId;

    @Column(name = "Ideas_Desc", nullable = false)
    private String description;

    @OneToMany(mappedBy = "ideaId")
    List<RewardEntity> rewards;

    @Column(name = "id_user")
    @JoinColumn(name = "id_user")
    Long userId;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    IdeaStatus status;
}
