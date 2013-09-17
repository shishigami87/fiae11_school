package org.shishigami.pattern.state.states.player;

import org.shishigami.pattern.state.example.Input;
import org.shishigami.pattern.state.example.Player;

public interface PlayerState {
	
	public void handleInput(Player player, Input input);

}
