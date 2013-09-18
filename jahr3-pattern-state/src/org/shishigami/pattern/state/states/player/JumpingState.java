package org.shishigami.pattern.state.states.player;

import org.shishigami.pattern.state.example.Action;
import org.shishigami.pattern.state.example.Input;
import org.shishigami.pattern.state.example.Player;
import org.shishigami.pattern.state.example.Player.PlayerImage;

public class JumpingState implements PlayerState {
	
	public JumpingState() {
		System.out.println("[INFO] Entering Jumping State.");
	}

	@Override
	public void handleInput(Player player, Input input) {
		if (input.getPressedKey().equals(Action.JUMP)) {
			System.out.println("[ERROR] Can't jump while jumping!");
		} else if (input.getPressedKey().equals(Action.CROUCH)) {
			System.out.println("[ERROR] Can't crouch while jumping!");
		} else if (input.getPressedKey().equals(Action.DIVE_ATTACK)) {
			player.setPlayerImage(PlayerImage.IMAGE_DIVEATTACKING);
			player.setPlayerState(new DiveAttackState());
		}
	}

}
