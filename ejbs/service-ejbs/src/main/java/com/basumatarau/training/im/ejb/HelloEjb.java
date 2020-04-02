package com.basumatarau.training.im.ejb;

import com.basumatarau.training.im.ejb.domain.user.User;
import com.basumatarau.training.im.ejb.repository.UserRepository;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Date;

@Stateless
@LocalBean
@Local(HelloEjbLocal.class)
public class HelloEjb implements HelloEjbLocal{

    @Inject
    private UserRepository userRepository;

    public HelloEjb() {
    }

    @Override
    public User getSomeUser() {
        return userRepository.getOne(1L);
    }

    @Override
    public String getGreetings() {
        return "Hello! at: " + new Date().toString();
    }
}
