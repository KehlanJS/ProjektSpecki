package com.it.manager.dto;

import lombok.*;

import java.time.Instant;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsersDetailsDTO {
    private String name;
    private String surname;
    private String login;
    private String role;
    private Instant created;
    private List<IdeaDetailsDTO> ideas;
    private List<RewardDetailsDTO> rewards;
}
