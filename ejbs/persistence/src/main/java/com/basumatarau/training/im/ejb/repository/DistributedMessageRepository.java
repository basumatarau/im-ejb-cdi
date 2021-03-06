package com.basumatarau.training.im.ejb.repository;

import com.basumatarau.training.im.ejb.domain.ChatRoom;
import com.basumatarau.training.im.ejb.domain.DistributedMessage;
import com.basumatarau.training.im.ejb.domain.Message;
import com.basumatarau.training.im.ejb.domain.Subscription;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DistributedMessageRepository
        extends JpaRepository<DistributedMessage, Long> {

    List<Message> findByChatRoom(ChatRoom chatRoom);

    Slice<Message> findByChatRoom(ChatRoom chatRoom, Pageable pageable);

    @Query(value = "select msg from DistributedMessage msg " +
            "where msg.chatRoom.id=:#{#sub.chatRoom.id} " +
            "and msg.timeSent>:#{#sub.enteredChat} ")
    Page<DistributedMessage> findMessagesForSubscription(
            Pageable pageable,
            @Param("sub") Subscription sub);
}
