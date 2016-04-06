package com.mart.rpgbot.repository;

import com.mart.rpgbot.entitys.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends CrudRepository<Item, Long>{

    Optional<Item> findById(int id);

    List<Item> findByItemName(String itemName);
}
