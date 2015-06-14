package edu.nju.controller.msgqueue.operation;

import edu.nju.controller.msgqueue.OperationQueue;
import edu.nju.model.service.GameModelService;

public class SetCustomGameOperation extends MineOperation{
	private int height;
	private int width;
	private int nums;
	
	public SetCustomGameOperation(int height, int width, int nums) {
		this.height = height;
		this.width = width;
		this.nums = nums;
	}

	@Override
	public void execute() {
		GameModelService game = OperationQueue.getGameModel();
		String inform = Integer.toString(height) + " " + Integer.toString(width) + " " + Integer.toString(nums);
		game.setGameLevel(inform);
		game.startGame();
	}
}
