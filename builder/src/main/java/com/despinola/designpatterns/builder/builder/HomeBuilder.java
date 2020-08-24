package com.despinola.designpatterns.builder.builder;

import com.despinola.designpatterns.builder.dto.Home;

public interface HomeBuilder {
    void setFloor();
    void setWalls();
    void setRoof();
    void setDoor();
    Home getHome();
}
