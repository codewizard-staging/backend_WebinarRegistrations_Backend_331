package com.app.WebinarRegistrations_Backend.repository;

import com.app.WebinarRegistrations_Backend.model.User;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class UserRepository extends SimpleJpaRepository<User, String> {
    private final EntityManager em;
    public UserRepository(EntityManager em) {
        super(User.class, em);
        this.em = em;
    }
    @Override
    public List<User> findAll() {
        return em.createNativeQuery("Select * from \"webinarregistrations_backend\".\"User\"", User.class).getResultList();
    }
}