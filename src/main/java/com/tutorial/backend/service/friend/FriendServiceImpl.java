package com.tutorial.backend.service.friend;

import com.tutorial.backend.controller.dto.FriendDto;
import com.tutorial.backend.entity.Friend;
import com.tutorial.backend.entity.Member;
import com.tutorial.backend.repository.FriendRepository;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

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
                .friendMemberId(friend.getId())
                .nickname(name)
                .isRegistered("true")
                .member(me)
                .friendMember(friend)
                .build();

        Friend savedFriend = friendRepository.save(newFriend);

        log.info("새로운 친구가 추가되었습니다: {}", savedFriend);
        return savedFriend;
    }

    @Override
    public List<FriendDto> getAllFriendsByMemberId(Long memberId) {
        List<Friend> friends = friendRepository.findByMemberId(memberId);
        List<Friend> addedFriends = friendRepository.findByFriendMemberId(memberId);
        log.info(friends.toString());
        List<FriendDto> friendDTOs = friends.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
        List<FriendDto> addedFriendDTOs = addedFriends.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());

        friendDTOs.addAll(addedFriendDTOs);

        return friendDTOs;
    }

    private FriendDto convertToDTO(Friend friend) {
        return new FriendDto(
                friend.getFriendMemberId(),
                friend.getIsRegistered(),
                friend.getNickname(),
                friend.getFriendMember().getMemberName(),
                friend.getFriendMember().getProfileImageUrl()
        );
    }

}
