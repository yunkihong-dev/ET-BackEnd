package com.tutorial.backend.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChatRoom is a Querydsl query type for ChatRoom
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChatRoom extends EntityPathBase<ChatRoom> {

    private static final long serialVersionUID = -2006985983L;

    public static final QChatRoom chatRoom = new QChatRoom("chatRoom");

    public final StringPath chatRoomName = createString("chatRoomName");

    public final ListPath<ChattingHeader, QChattingHeader> chattingHeaders = this.<ChattingHeader, QChattingHeader>createList("chattingHeaders", ChattingHeader.class, QChattingHeader.class, PathInits.DIRECT2);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath lastChat = createString("lastChat");

    public final DateTimePath<java.time.LocalDateTime> lastChatTime = createDateTime("lastChatTime", java.time.LocalDateTime.class);

    public QChatRoom(String variable) {
        super(ChatRoom.class, forVariable(variable));
    }

    public QChatRoom(Path<? extends ChatRoom> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChatRoom(PathMetadata metadata) {
        super(ChatRoom.class, metadata);
    }

}

