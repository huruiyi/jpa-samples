package com.in28minutes.learning.jpa.jpain10steps.service;


import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}

/*
 * Spring Data JPA
 *
 *
 *
 */
