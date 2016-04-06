package com.mart.rpgbot.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skills")
public class Skills {

    @Id
    @Column
    private String id;

    @Column
    private int woodcutting;

    @Column
    private int mining;

    @Column
    private int farming;

    @Column
    private int scavenging;
}
