package com.it.manager.dto;

import com.it.manager.domain.IdeaStatus;
import lombok.*;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IdeaDetailsDTO {
    private String description;
    private IdeaStatus status;
    private List<RewardDetailsDTO> rewards;
}
