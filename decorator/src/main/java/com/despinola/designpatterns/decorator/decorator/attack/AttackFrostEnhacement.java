package com.despinola.designpatterns.decorator.decorator.attack;

import com.despinola.designpatterns.decorator.util.Constants;

public class AttackFrostEnhacement extends AttackEnhancement {

    public AttackFrostEnhacement(IAttack attack) {
        super(attack, Constants.FROST_ENHACEMENT_POWER);
    }

    @Override
    public int getAttack() {
        return super.attack.getAttack() + super.enhacementPower;
    }
}
