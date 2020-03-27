package com.basumatarau.training.im.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.Date;

@Stateless
@Local(HelloEjbLocal.class)
@Remote(HelloEjbRemote.class)
public class HelloEjb implements HelloEjbLocal, HelloEjbRemote{

    public HelloEjb() {
    }

    @Override
    public String getGreetings() {
        return "Hello! at: " + new Date().toString();
    }
}
