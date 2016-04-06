package com.mart.rpgbot.repository;

import com.mart.rpgbot.entitys.ItemBase;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ItemBaseRepository extends CrudRepository<ItemBase, Long> {

    Optional<ItemBase> findById(int id);

}
