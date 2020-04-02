package com.basumatarau.training.im.ejb.repository;

import com.basumatarau.training.im.ejb.domain.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {

    @Query(value = "select cr from ChatRoom cr " +
            "join fetch cr.subscriptions subs " +
            "where cr.id=:#{#chatRoomId} ")
    Optional<ChatRoom> findChatRoomByIdWithAllPeers(@Param("chatRoomId") Long id);
}
