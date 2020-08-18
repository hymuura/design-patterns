package com.despinola.designpatterns.decorator.dto.attack;

import com.despinola.designpatterns.decorator.decorator.attack.IAttack;
import com.despinola.designpatterns.decorator.util.Constants;

public class Sword extends Weapon {

    private int power;

    public Sword() {
        this.power = Constants.SWORD_POWER;
    }

    @Override
    public int getAttack() {
        return this.power;
    }
}
