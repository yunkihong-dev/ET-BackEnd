package com.tutorial.backend.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 934286536L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMember member = new QMember("member1");

    public final EnumPath<com.tutorial.backend.entity.type.Authority> authority = createEnum("authority", com.tutorial.backend.entity.type.Authority.class);

    public final ListPath<ChattingHeader, QChattingHeader> chattingHeaders = this.<ChattingHeader, QChattingHeader>createList("chattingHeaders", ChattingHeader.class, QChattingHeader.class, PathInits.DIRECT2);

    public final ListPath<Friend, QFriend> friends = this.<Friend, QFriend>createList("friends", Friend.class, QFriend.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath memberEmail = createString("memberEmail");

    public final StringPath memberName = createString("memberName");

    public final StringPath memberPhone = createString("memberPhone");

    public final QFile profileImage;

    public final EnumPath<com.tutorial.backend.entity.type.StatusType> status = createEnum("status", com.tutorial.backend.entity.type.StatusType.class);

    public QMember(String variable) {
        this(Member.class, forVariable(variable), INITS);
    }

    public QMember(Path<? extends Member> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMember(PathMetadata metadata, PathInits inits) {
        this(Member.class, metadata, inits);
    }

    public QMember(Class<? extends Member> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.profileImage = inits.isInitialized("profileImage") ? new QFile(forProperty("profileImage"), inits.get("profileImage")) : null;
    }

}

