package com.it.manager.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "roles")
@ToString
public class RoleEntity {

    @Id
    @GeneratedValue
    @Column(name = "id_roles", nullable = false)
    private Long id;

    @NonNull
    @Enumerated(EnumType.STRING)
    @Column(name = "Roles_Name")
    Roles roleName;
}
