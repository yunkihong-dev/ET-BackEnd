package com.tutorial.backend.repository;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tutorial.backend.controller.dto.FriendDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.tutorial.backend.entity.QFriend.friend;
import static com.tutorial.backend.entity.QMember.member;

@Slf4j
@Repository
@RequiredArgsConstructor
public class FriendQueryDSLImpl implements FriendQueryDsl{

    private final JPAQueryFactory query;

    @Override
    public List<FriendDto> findAllFriendsByMemberId(Long myId) {
        return query
                .select(Projections.constructor(
                        FriendDto.class,
                        friend.id.longValue(),
                        friend.friendId.memberName,
                        friend.friendId.profileImageUrl
                ))
                .from(friend)
                .join(friend.friendId, member)
                .where(friend.member.id.eq(myId))
                .fetch();
    }
}
