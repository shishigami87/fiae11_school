package org.shishigami.pattern.state.example;

public class Input {

	private String pressedKey = Action.NOTHING;

	public String getPressedKey() {
		return pressedKey;
	}

	public void debugJump() {
		pressedKey = Action.JUMP;
	}

	public void debugCrouch() {
		pressedKey = Action.CROUCH;
	}

	public void debugDiveAttack() {
		pressedKey = Action.DIVE_ATTACK;
	}

}
