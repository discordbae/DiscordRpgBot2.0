package com.mart.rpgbot.entitys;

import javax.persistence.*;

@Entity
@Table(name="itembase")
public class ItemBase {

    @Id
    @Column
    @GeneratedValue
    private int id;

    @Column
    private String baseName;

    public ItemBase(String baseName){
        this.baseName = baseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }
}
