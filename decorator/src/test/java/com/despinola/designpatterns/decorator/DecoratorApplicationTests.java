package com.despinola.designpatterns.decorator;

import com.despinola.designpatterns.decorator.decorator.attack.AttackFireEnhacement;
import com.despinola.designpatterns.decorator.decorator.attack.AttackFrostEnhacement;
import com.despinola.designpatterns.decorator.dto.attack.Sword;
import com.despinola.designpatterns.decorator.dto.characters.Soldier;
import com.despinola.designpatterns.decorator.util.Constants;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DecoratorApplicationTests {

	@Test
	void powerSwordTest() {
		Soldier s = new Soldier("Max",100, new Sword());
		assertEquals(Constants.SWORD_POWER ,
				s.attack(),
				"it will be equals");
	}

	@Test
	void powerFrostSwordTest() {
		Soldier s = new Soldier("Max",100, new AttackFrostEnhacement(new Sword()));
		assertEquals(Constants.SWORD_POWER + Constants.FROST_ENHACEMENT_POWER,
				s.attack(),
				"it will be equals");
	}

	@Test
	void powerFireSwordTest() {
		Soldier s = new Soldier("Max",100, new AttackFireEnhacement(new Sword()));
		assertEquals(Constants.SWORD_POWER + Constants.FIRE_ENHACEMENT_POWER,
				s.attack(),
				"it will be equals");
	}

	@Test
	void powerFrostFireSwordTest() {
		Soldier s = new Soldier("Max",100, new AttackFrostEnhacement(new AttackFireEnhacement(new Sword())));
		assertEquals(Constants.SWORD_POWER + Constants.FIRE_ENHACEMENT_POWER + Constants.FROST_ENHACEMENT_POWER,
				s.attack(),
				"it will be equals");
	}
}
