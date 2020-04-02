package com.basumatarau.training.im.ejb.repository;

import com.basumatarau.training.im.ejb.domain.ChatRoom;
import com.basumatarau.training.im.ejb.domain.ImageResource;
import com.basumatarau.training.im.ejb.domain.MessageResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageResourceRepository
        extends JpaRepository<MessageResource, Long> {

    @Query(value = "select img from ImageResource img ")
    List<ImageResource> findImagesForChatRoom(ChatRoom chatRoom);
}
