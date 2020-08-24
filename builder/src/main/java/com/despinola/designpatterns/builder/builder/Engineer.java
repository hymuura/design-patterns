package com.despinola.designpatterns.builder.builder;

import com.despinola.designpatterns.builder.dto.Home;

public class Engineer {
    private HomeBuilder homeBuilder;
    public Engineer(HomeBuilder homeBuilder) {
        this.homeBuilder = homeBuilder;
    }

    public Home buildHome() {
        this.homeBuilder.setFloor();
        this.homeBuilder.setWalls();
        this.homeBuilder.setRoof();
        this.homeBuilder.setDoor();
        return this.homeBuilder.getHome();
    }
}
