package org.shishigami.pattern.state.example;

import java.util.Random;

public class Input {
	
	public String getPressedKey() {
		int randomNumber = new Random().nextInt(3);
		
		switch (randomNumber) {
			case 0: return Action.JUMP;
			case 1: return Action.CROUCH;
			default: return Action.DIVE_ATTACK;
		}
	}
	
}
