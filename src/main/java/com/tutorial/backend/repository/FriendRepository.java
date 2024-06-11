package com.tutorial.backend.repository;

import com.tutorial.backend.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long>, FriendQueryDsl{
    List<Friend> findByMemberId(Long memberId);
    List<Friend> findByFriendMemberId(Long friendMemberId);

}
