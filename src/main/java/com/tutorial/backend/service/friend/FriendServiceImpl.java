package com.tutorial.backend.service.friend;
import com.tutorial.backend.controller.dto.FriendDto;
import com.tutorial.backend.entity.Friend;
import com.tutorial.backend.entity.Member;
import com.tutorial.backend.repository.FriendRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class FriendServiceImpl implements FriendService {
    private final FriendRepository friendRepository;

    @Override
    public Friend addNewFriend(String name, Member friend, Member me) {
        // 새로운 Friend 엔티티 생성
        Friend newFriend = Friend.builder()
                .nickname(name)
                .isRegistered("true")  // 필요한 값 설정
                .member(me)
                .friendId(friend)
                .build();

        // Friend 엔티티 저장
        Friend savedFriend = friendRepository.save(newFriend);

        log.info("새로운 친구가 추가되었습니다: {}", savedFriend);
        return savedFriend;
    }

    @Override
    public List<FriendDto> getMyFriends(Long myId) {
        return friendRepository.findAllFriendsByMemberId(myId);
    }
}
