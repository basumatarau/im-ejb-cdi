package com.basumatarau.training.im.ejb.repository.util;

import com.basumatarau.training.im.ejb.domain.user.User_;
import com.basumatarau.training.im.ejb.domain.user.User;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class UserSpecifications {
    public static Specification<User> hasEmailLike(String pattern){
        return new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root,
                                         CriteriaQuery<?> query,
                                         CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get(User_.EMAIL), "%" + pattern + "%");
            }
        };
    }

    public static Specification<User> hasNickNameLike(String pattern){
        return new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root,
                                         CriteriaQuery<?> query,
                                         CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get(User_.NICK_NAME), "%" + pattern + "%");
            }
        };
    }
}
