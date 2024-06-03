package com.tutorial.backend.repository;

import com.tutorial.backend.controller.dto.FriendDto;

import java.util.List;

public interface FriendQueryDsl {
    List<FriendDto> findAllFriendsByMemberId(Long id);
}
