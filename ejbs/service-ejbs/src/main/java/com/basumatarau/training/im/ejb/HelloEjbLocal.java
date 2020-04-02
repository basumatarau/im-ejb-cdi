package com.basumatarau.training.im.ejb;

import com.basumatarau.training.im.ejb.domain.user.User;

import javax.ejb.Local;

@Local
public interface HelloEjbLocal {
    String getGreetings();
    User getSomeUser();
}
