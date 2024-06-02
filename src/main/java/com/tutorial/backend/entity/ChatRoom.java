package com.tutorial.backend.entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity @Getter @Setter @Table(name = "tbl_chatroom")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String lastChat;
    private String chatRoomName;
    private LocalDateTime lastChatTime;

    @OneToMany(mappedBy = "chatRoom")
    private List<ChattingHeader> chattingHeaders;

}
