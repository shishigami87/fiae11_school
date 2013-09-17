package org.shishigami.pattern.state.states.player;

import org.shishigami.pattern.state.example.Action;
import org.shishigami.pattern.state.example.Input;
import org.shishigami.pattern.state.example.Player;
import org.shishigami.pattern.state.example.Player.PlayerImage;

public class StandingState implements PlayerState {

	@Override
	public void handleInput(Player player, Input input) {
		if (input.getPressedKey().equals(Action.JUMP)) {
			player.setPlayerImage(PlayerImage.IMAGE_JUMPING);
			player.setPlayerState(new JumpingState());
		} else if (input.getPressedKey().equals(Action.CROUCH)) {
			player.setPlayerImage(PlayerImage.IMAGE_CROUCHING);
			player.setPlayerState(new CrouchingState());
		} else if (input.getPressedKey().equals(Action.DIVE_ATTACK)) {
			// can't dive attack while standing
		}
	}

}
