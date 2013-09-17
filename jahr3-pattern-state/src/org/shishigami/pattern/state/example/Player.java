package org.shishigami.pattern.state.example;

import org.shishigami.pattern.state.states.player.PlayerState;
import org.shishigami.pattern.state.states.player.StandingState;

public class Player {

	private PlayerImage playerImage;
	private PlayerState playerState;

	public Player() {
		playerImage = PlayerImage.IMAGE_STANDING;
		playerState = new StandingState();
	}

	public void handleInput(Input input) {
		playerState.handleInput(this, input);
	}

	public PlayerImage getPlayerImage() {
		return playerImage;
	}

	public void setPlayerImage(PlayerImage playerImage) {
		this.playerImage = playerImage;
	}

	public PlayerState getPlayerState() {
		return playerState;
	}

	public void setPlayerState(PlayerState playerState) {
		this.playerState = playerState;
	}

	public enum PlayerImage {
		IMAGE_STANDING, IMAGE_JUMPING, IMAGE_CROUCHING, IMAGE_DIVEATTACKING
	}

}
