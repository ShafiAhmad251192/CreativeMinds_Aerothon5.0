package com.airbus.aerothon.partsservice.repository;

import org.springframework.stereotype.Repository;

import com.airbus.aerothon.partsservice.model.Role;
import com.airbus.aerothon.partsservice.model.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class UserDao {

    @PersistenceContext
    EntityManager entityManager;
    
    @Transactional
    public void saveUser(User user) {
        entityManager.merge(user);
    }

    public User getUserByEmail(String email) {
        return entityManager.createQuery("FROM User WHERE email=:email", User.class)
        .setParameter("email", email)
        .getSingleResult();
    }

    public Role getRoleById(Long id) {
         return entityManager.createQuery("FROM Role WHERE id=:id", Role.class)
        .setParameter("id", id)
        .getSingleResult();
    }
}
