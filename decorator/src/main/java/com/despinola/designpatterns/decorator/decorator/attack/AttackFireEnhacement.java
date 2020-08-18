package com.despinola.designpatterns.decorator.decorator.attack;

import com.despinola.designpatterns.decorator.util.Constants;

public class AttackFireEnhacement extends AttackEnhancement {

    public AttackFireEnhacement(IAttack attack) {
        super(attack, Constants.FIRE_ENHACEMENT_POWER);
    }

    @Override
    public int getAttack() {
        return super.attack.getAttack() + super.enhacementPower;
    }
}
