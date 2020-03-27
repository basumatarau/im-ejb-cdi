package com.basumatarau.training.im.ejb;

import javax.ejb.Remote;

@Remote
public interface HelloEjbRemote {
    String getGreetings();
}
