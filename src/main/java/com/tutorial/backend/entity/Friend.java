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
    @Column(name = "friend_member_id")
    private Long friendMemberId;

    private String isRegistered;
    private String nickname;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne
    @JoinColumn(name = "friend_member_id", insertable = false, updatable = false)
    @MapsId
    private Member friendMember;

    @Builder
    public Friend(Long friendMemberId, String isRegistered, String nickname, Member member, Member friendMember) {
        this.friendMemberId = friendMemberId;
        this.isRegistered = isRegistered;
        this.nickname = nickname;
        this.member = member;
        this.friendMember = friendMember;
    }
}
