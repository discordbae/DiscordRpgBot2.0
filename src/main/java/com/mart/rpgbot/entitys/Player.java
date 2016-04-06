package com.mart.rpgbot.entitys;

import javax.persistence.*;

@Entity
@Table(name="player")
public class Player {

    @Id
    @Column
    private String id;

    @Column(name = "class")
    private String playerClass;

    @Column
    private int level;

    @Column
    private double exp;

    @Column
    private int strength;

    @Column
    private int intelligence;

    @Column
    private int dexterity;

    @Column
    private int luck;

    @Column
    private int blockChance;

    protected Player() {}

    public Player(String id) {
        this.id = id;
    }

    public Player(String id, String playerClass, int level, double exp, int strength, int intelligence, int dexterity, int luck, int blockChance){
        this.id = id;
        this.playerClass = playerClass;
        this.level = level;
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.luck = luck;
        this.blockChance = blockChance;
    }

    String getId(){
        return id;
    }

    void setId(String id){
        this.id=id;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getBlockChance() {
        return blockChance;
    }

    public void setBlockChance(int blockChance) {
        this.blockChance = blockChance;
    }

}
