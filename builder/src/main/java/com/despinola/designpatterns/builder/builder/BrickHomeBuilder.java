package com.despinola.designpatterns.builder.builder;

import com.despinola.designpatterns.builder.dto.Home;

public class BrickHomeBuilder implements  HomeBuilder {
    private Home home;
    public BrickHomeBuilder() {
        home = new Home();
    }

    @Override
    public void setFloor() {
        home.setFloor("BrickFloor");
    }

    @Override
    public void setWalls() {
        home.setWalls("BrickWalls");
    }

    @Override
    public void setRoof() {
        home.setRoof("BrickRoof");
    }

    @Override
    public void setDoor() {
        home.setDoor("BrickDoor");
    }

    @Override
    public Home getHome() {
        return home;
    }
}
