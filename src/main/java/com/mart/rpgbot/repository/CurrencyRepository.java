package com.mart.rpgbot.repository;


import com.mart.rpgbot.entitys.Currency;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CurrencyRepository extends CrudRepository<Currency, Long> {

    Optional<Currency> findById(String id);

}
