package com.tutorial.backend.repository;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tutorial.backend.entity.QFriend;
import com.tutorial.backend.entity.QMember;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class FriendQueryDSLImpl implements FriendQueryDsl {

    private final JPAQueryFactory queryFactory;

}
