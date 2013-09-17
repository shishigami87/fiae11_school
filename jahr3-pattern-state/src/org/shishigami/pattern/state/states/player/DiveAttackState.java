package org.shishigami.pattern.state.states.player;

import org.shishigami.pattern.state.example.Action;
import org.shishigami.pattern.state.example.Input;
import org.shishigami.pattern.state.example.Player;

public class DiveAttackState implements PlayerState {

	@Override
	public void handleInput(Player player, Input input) {
		if (input.getPressedKey().equals(Action.JUMP)) {
			// just no.
		} else if (input.getPressedKey().equals(Action.CROUCH)) {
			// i don't even
		} else if (input.getPressedKey().equals(Action.DIVE_ATTACK)) {
			// diveattackception!
		}
	}

}
