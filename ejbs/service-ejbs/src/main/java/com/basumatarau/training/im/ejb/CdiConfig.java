package com.basumatarau.training.im.ejb;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CdiConfig {
    @Produces
    @Dependent
    @PersistenceContext(name = "im-db")
    public EntityManager entityManager;
}
