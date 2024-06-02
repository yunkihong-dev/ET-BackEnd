package com.tutorial.backend.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChattingHeader is a Querydsl query type for ChattingHeader
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChattingHeader extends EntityPathBase<ChattingHeader> {

    private static final long serialVersionUID = 1347778721L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChattingHeader chattingHeader = new QChattingHeader("chattingHeader");

    public final QChatRoom chatRoom;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QMember member;

    public QChattingHeader(String variable) {
        this(ChattingHeader.class, forVariable(variable), INITS);
    }

    public QChattingHeader(Path<? extends ChattingHeader> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChattingHeader(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChattingHeader(PathMetadata metadata, PathInits inits) {
        this(ChattingHeader.class, metadata, inits);
    }

    public QChattingHeader(Class<? extends ChattingHeader> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.chatRoom = inits.isInitialized("chatRoom") ? new QChatRoom(forProperty("chatRoom")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

