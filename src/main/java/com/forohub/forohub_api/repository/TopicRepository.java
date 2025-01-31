package com.forohub.forohub_api.repository;

import com.forohub.forohub_api.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
    // Aquí puedes añadir métodos personalizados de consulta si los necesitas
}
