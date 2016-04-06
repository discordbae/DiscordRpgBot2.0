package com.mart.rpgbot.entitys;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @Column
    @GeneratedValue
    private int id;

    @Column
    private int baseItemId;

    @Column
    private String itemName;

    @Column
    private String itemDescription;

    @Column
    private String itemType;

    @Column
    private String itemAttribute;

    @Column
    private  int itemValue;

    @Column
    private String itemRareness;

    @Column
    private double damageValue;

    public Item(int baseItemId, String itemName, String itemDescription, String itemType, String itemAttribute, int itemValue,
                String itemRareness, double damageValue){
        this.baseItemId = baseItemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemType = itemType;
        this.itemAttribute = itemAttribute;
        this.itemValue = itemValue;
        this.itemRareness = itemRareness;
        this.damageValue = damageValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBaseItemId() {
        return baseItemId;
    }

    public void setBaseItemId(int baseItemId) {
        this.baseItemId = baseItemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemAttribute() {
        return itemAttribute;
    }

    public void setItemAttribute(String itemAttribute) {
        this.itemAttribute = itemAttribute;
    }

    public int getItemValue() {
        return itemValue;
    }

    public void setItemValue(int itemValue) {
        this.itemValue = itemValue;
    }

    public String getItemRareness() {
        return itemRareness;
    }

    public void setItemRareness(String itemRareness) {
        this.itemRareness = itemRareness;
    }

    public double getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(double damageValue) {
        this.damageValue = damageValue;
    }
}
