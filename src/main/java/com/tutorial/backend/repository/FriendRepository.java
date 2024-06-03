package com.tutorial.backend.repository;

import com.tutorial.backend.controller.dto.FriendDto;
import com.tutorial.backend.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Long>, FriendQueryDsl{

}
