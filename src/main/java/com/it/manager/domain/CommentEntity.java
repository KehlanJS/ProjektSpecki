package com.it.manager.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;


@Entity
@Getter
@NoArgsConstructor
@Table(name = "Comments")
public class CommentEntity {

    @Id
    @Column(name = "id_comment", nullable = false)
    private Long id;

    @Column(name = "id_user", nullable = false)
    private Long userId;

    @Column(name = "id_idea", nullable = false)
    private Long ideaId;

    @Column(name = "Comments_Description", nullable = false)
    private String description;

    @Column(name = "comments_ts", nullable = false)
    private Instant timeStamp;

}