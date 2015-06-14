package edu.nju.controller.msgqueue.operation;

import edu.nju.controller.msgqueue.OperationQueue;
import edu.nju.model.service.GameModelService;

public class SetHellGameOperation extends MineOperation{

	@Override
	public void execute() {
		GameModelService game = OperationQueue.getGameModel();
		
		game.setGameLevel("大");
		game.startGame();
	}

}
