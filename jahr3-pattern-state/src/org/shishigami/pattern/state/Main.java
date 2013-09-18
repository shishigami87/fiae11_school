package org.shishigami.pattern.state;

import org.shishigami.pattern.state.example.Input;
import org.shishigami.pattern.state.example.Player;

public class Main {

	public static void main(String[] args) {
		Input input = new Input();
		Player player = new Player();
		
		// Player is currently standing, expected : can't dive attack
		input.debugDiveAttack();
		player.handleInput(input);
		
		// expected : enter jumping state
		input.debugJump();
		player.handleInput(input);
		
		// expected : can't crouch while jumping
		input.debugCrouch();
		player.handleInput(input);
		
		// expected : can't jump while jumping
		input.debugJump();
		player.handleInput(input);
		
		// expected : enter dive attack state
		input.debugDiveAttack();
		player.handleInput(input);
	}

}
