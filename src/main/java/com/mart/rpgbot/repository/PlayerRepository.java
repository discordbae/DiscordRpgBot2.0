package com.mart.rpgbot.repository;

import com.mart.rpgbot.entitys.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PlayerRepository extends CrudRepository<Player, Long> {

    Optional<Player> findById(int id);

}
