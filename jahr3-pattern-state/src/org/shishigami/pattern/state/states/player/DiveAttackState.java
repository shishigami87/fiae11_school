package org.shishigami.pattern.state.states.player;

import org.shishigami.pattern.state.example.Action;
import org.shishigami.pattern.state.example.Input;
import org.shishigami.pattern.state.example.Player;

public class DiveAttackState implements PlayerState {
	
	public DiveAttackState() {
		System.out.println("[INFO] Entering DiveAttack State.");
	}

	@Override
	public void handleInput(Player player, Input input) {
		if (input.getPressedKey().equals(Action.JUMP)) {
			System.out.println("[ERROR] Can't jump while dive attacking!");
		} else if (input.getPressedKey().equals(Action.CROUCH)) {
			System.out.println("[ERROR] Can't crouch while dive attacking!");
		} else if (input.getPressedKey().equals(Action.DIVE_ATTACK)) {
			System.out.println("[ERROR] Can't dive attack while dive attacking!");
		}
	}

}
