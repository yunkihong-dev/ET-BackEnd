package com.tutorial.backend.entity;

import com.tutorial.backend.entity.type.Authority;
import com.tutorial.backend.entity.type.StatusType;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "tbl_member") @Entity @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String memberEmail;

    private String memberName;

    private String memberPhone;

    @Enumerated(EnumType.STRING)
    private StatusType status;

    @Enumerated(EnumType.STRING)
    private Authority authority;


    @OneToMany(mappedBy = "member")
    private List<ChattingHeader> chattingHeaders;

    @OneToMany(mappedBy = "friend")
    private List<Friend> friends;

    @OneToOne
    @JoinColumn(name = "profile_image_file_id")
    private File profileImage;

    @Builder
    public Member(Long id, String memberEmail, String memberName, String memberPhone, StatusType status, Authority authority, List<ChattingHeader> chattingHeaders, List<Friend> friends, File profileImage) {
        this.id = id;
        this.memberEmail = memberEmail;
        this.memberName = memberName;
        this.memberPhone = memberPhone;
        this.status = status;
        this.authority = authority;
        this.chattingHeaders = chattingHeaders;
        this.friends = friends;
        this.profileImage = profileImage;
    }


    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public void setChattingHeaders(List<ChattingHeader> chattingHeaders) {
        this.chattingHeaders = chattingHeaders;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public void setProfileImage(File profileImage) {
        this.profileImage = profileImage;
    }

    public Member update(String memberName, String memberPhoneNumber, String memberEmail){
        this.setMemberName(memberName);
        this.setMemberPhone(memberPhoneNumber);
        this.setMemberEmail(memberEmail);
        return this;
    }


    public Member update(String name, String email) {
        this.memberName = name;
        this.memberEmail = email;
        return this;
    }
}
