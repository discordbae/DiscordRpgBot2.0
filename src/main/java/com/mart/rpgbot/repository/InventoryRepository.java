package com.mart.rpgbot.repository;


import com.mart.rpgbot.entitys.Inventory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InventoryRepository extends CrudRepository<Inventory, Long> {

    List<Inventory> findByPlayerId(String playerId);

}
