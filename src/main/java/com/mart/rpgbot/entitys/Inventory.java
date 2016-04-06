package com.mart.rpgbot.entitys;

import javax.persistence.*;

@Entity
@Table
public class Inventory {

    @Id
    @Column
    @GeneratedValue
    private int id;

    @Column
    private String playerId;

    @Column
    private int itemId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}
