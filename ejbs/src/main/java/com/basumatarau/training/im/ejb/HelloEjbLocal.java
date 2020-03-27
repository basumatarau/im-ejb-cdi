package com.basumatarau.training.im.ejb;

import javax.ejb.Local;

@Local
public interface HelloEjbLocal {
    String getGreetings();
}
