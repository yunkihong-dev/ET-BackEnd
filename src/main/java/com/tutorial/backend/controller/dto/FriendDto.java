package com.tutorial.backend.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@NoArgsConstructor
public class FriendDto {
    Long id;
    String friendName;
    String friendProfileImage;

    public FriendDto(Long id, String friendName, String friendProfileImage) {
        this.id = id;
        this.friendName = friendName;
        this.friendProfileImage = friendProfileImage;
    }
}
