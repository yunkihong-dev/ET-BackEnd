package com.tutorial.backend.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name = "tbl_friend")
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Friend {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String isRegistered;
    private String nickname;

    @ManyToOne
    @JoinColumn(name = "friend_id", nullable = false)
    private Member friend;

    @OneToOne
    @JoinColumn(name = "profile_image_file_id")
    private File profileImageFile;

    // getters and setters
}
