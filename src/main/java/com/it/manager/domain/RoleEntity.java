package com.it.manager.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "roles")
public class RoleEntity {

    @Id
    @GeneratedValue
    @Column(name = "id_roles", nullable = false)
    private Long id;

    @NonNull
    @Enumerated(EnumType.STRING)
    @Column(name = "Roles_Name")
    Roles roleName;

    @OneToMany(mappedBy = "role")
    List<UserEntity> users;
}
