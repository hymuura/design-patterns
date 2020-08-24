package com.despinola.designpatterns.builder;

import com.despinola.designpatterns.builder.builder.BrickHomeBuilder;
import com.despinola.designpatterns.builder.builder.Engineer;
import com.despinola.designpatterns.builder.dto.Home;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderApplicationTest {

    @Test
    public void builderBrickTest() {
        Home home = new Engineer(new BrickHomeBuilder()).buildHome();

        assertEquals("BrickFloor", home.getFloor());
        assertEquals("BrickWalls", home.getWalls());
        assertEquals("BrickRoof", home.getRoof());
        assertEquals("BrickDoor", home.getDoor());
    }
}
