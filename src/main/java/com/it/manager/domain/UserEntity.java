package com.it.manager.domain;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "Users")
public class UserEntity {

    @Id
    @GeneratedValue
    @Column(name = "id_user", nullable = false)
    Long id;

    @NonNull
    @Column(name = "users_name", nullable = false)
    private String name;

    @NonNull
    @Column(name = "users_surname", nullable = false)
    private String surname;

    @NonNull
    @Column(name = "created", nullable = false)
    private Instant created;

    @NonNull
    @Column(name = "login", nullable = false)
    private String login;

    @NonNull
    @Column(name = "password", nullable = false)
    private String password;

    @NonNull
    @OneToMany(mappedBy = "userId")
    List<RewardEntity> rewards;

    @NonNull
    @OneToMany(mappedBy = "userId")
    List<IdeaEntity> ideas;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "id_roles")
    RoleEntity role;
}
