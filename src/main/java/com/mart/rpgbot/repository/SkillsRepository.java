package com.mart.rpgbot.repository;


import com.mart.rpgbot.entitys.Skills;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SkillsRepository extends CrudRepository<Skills, Long> {

    Optional<Skills> findById(String playerId);
}
