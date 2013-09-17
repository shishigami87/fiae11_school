package org.shishigami.pattern.state.states.player;

import org.shishigami.pattern.state.example.Action;
import org.shishigami.pattern.state.example.Input;
import org.shishigami.pattern.state.example.Player;
import org.shishigami.pattern.state.example.Player.PlayerImage;

public class JumpingState implements PlayerState {

	@Override
	public void handleInput(Player player, Input input) {
		if (input.getPressedKey().equals(Action.JUMP)) {
			// can't double jump
		} else if (input.getPressedKey().equals(Action.CROUCH)) {
			// can't crouch midair (unless this is counter strike)
		} else if (input.getPressedKey().equals(Action.DIVE_ATTACK)) {
			player.setPlayerImage(PlayerImage.IMAGE_DIVEATTACKING);
			player.setPlayerState(new DiveAttackState());
		}
	}

}
