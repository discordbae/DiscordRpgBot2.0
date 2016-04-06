package com.mart.rpgbot.entitys;

import javax.persistence.*;

@Entity
@Table(name = "body")
public class Body {

    @Id
    @Column
    private String id;

    @Column
    private int leftHandId;

    @Column
    private int rightHandId;

    @Column
    private int headId;

    @Column
    private int bodyId;

    @Column
    private int legsId;

    @Column
    private int bootsId;

    @Column
    private  int glovesId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLeftHandId() {
        return leftHandId;
    }

    public void setLeftHandId(int leftHandId) {
        this.leftHandId = leftHandId;
    }

    public int getRightHandId() {
        return rightHandId;
    }

    public void setRightHandId(int rightHandId) {
        this.rightHandId = rightHandId;
    }

    public int getHeadId() {
        return headId;
    }

    public void setHeadId(int headId) {
        this.headId = headId;
    }

    public int getBodyId() {
        return bodyId;
    }

    public void setBodyId(int bodyId) {
        this.bodyId = bodyId;
    }

    public int getLegsId() {
        return legsId;
    }

    public void setLegsId(int legsId) {
        this.legsId = legsId;
    }

    public int getBootsId() {
        return bootsId;
    }

    public void setBootsId(int bootsId) {
        this.bootsId = bootsId;
    }

    public int getGlovesId() {
        return glovesId;
    }

    public void setGlovesId(int glovesId) {
        this.glovesId = glovesId;
    }
}
