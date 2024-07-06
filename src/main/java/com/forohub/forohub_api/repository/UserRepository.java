package com.forohub.forohub_api.repository;

import com.forohub.forohub_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    // Otros métodos de consulta según necesidades
}
