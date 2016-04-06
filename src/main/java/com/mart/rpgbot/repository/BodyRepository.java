package com.mart.rpgbot.repository;

import com.mart.rpgbot.entitys.Body;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BodyRepository extends CrudRepository<Body, Long> {

    Optional<Body> findById(String id);

}
