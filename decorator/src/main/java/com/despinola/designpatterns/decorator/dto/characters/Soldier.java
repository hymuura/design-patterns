package com.despinola.designpatterns.decorator.dto.characters;

import com.despinola.designpatterns.decorator.decorator.attack.IAttack;
import com.despinola.designpatterns.decorator.dto.attack.Weapon;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Soldier {
    private final String name;
    private final int life;
    private final IAttack weapon;

    public int attack() {
        return this.weapon.getAttack();
    }
}
