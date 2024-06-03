package com.tutorial.backend.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_friend")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String isRegistered;
    private String nickname;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne
    @JoinColumn(name = "friend_id", nullable = false)
    private Member friendId;
    @Builder
    public Friend(int id, String isRegistered, String nickname, Member member, Member friendId) {
        this.id = id;
        this.isRegistered = isRegistered;
        this.nickname = nickname;
        this.member = member;
        this.friendId = friendId;
    }
}
