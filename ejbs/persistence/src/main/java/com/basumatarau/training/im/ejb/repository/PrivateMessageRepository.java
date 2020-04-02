package com.basumatarau.training.im.ejb.repository;

import com.basumatarau.training.im.ejb.domain.Message;
import com.basumatarau.training.im.ejb.domain.PersonalContact;
import com.basumatarau.training.im.ejb.domain.PrivateMessage;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrivateMessageRepository
        extends JpaRepository<PrivateMessage, Long> {

    List<Message> findByPersonalContact(PersonalContact personalContact);

    Slice<Message> findByPersonalContact(PersonalContact personalContact, Pageable pageable);
}
