package com.tutorial.backend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "tbl_message")
@Getter @Setter
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private LocalDateTime sendTime;
    private int readCount;
    private String emotion;
    private String status;
    private String type;

    private Long memberId;

    private Long chatRoomId;

}
