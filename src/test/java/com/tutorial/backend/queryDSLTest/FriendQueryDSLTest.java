package com.tutorial.backend.queryDSLTest;

import com.tutorial.backend.entity.Member;
import com.tutorial.backend.repository.FriendQueryDSLImpl;
import com.tutorial.backend.repository.FriendRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class FriendQueryDSLTest {

    @Mock
    private FriendRepository friendRepository;

    @Mock
    private JPAQueryFactory queryFactory;

    @InjectMocks
    private FriendQueryDSLImpl friendQueryDSLImpl;

}
