package com.despinola.designpatterns.decorator.decorator.attack;

public abstract class AttackEnhancement implements IAttack {

    protected IAttack attack;
    protected int enhacementPower;

    public AttackEnhancement(IAttack attack, int enhacementPower) {
        this.attack = attack;
        this.enhacementPower = enhacementPower;
    }
}
