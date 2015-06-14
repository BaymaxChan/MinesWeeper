package edu.nju.controller.impl;

import edu.nju.controller.msgqueue.OperationQueue;
import edu.nju.controller.msgqueue.operation.SetCustomGameOperation;
import edu.nju.controller.msgqueue.operation.SetEasyGameOperation;
import edu.nju.controller.msgqueue.operation.SetHardGameOperation;
import edu.nju.controller.msgqueue.operation.SetHellGameOperation;
import edu.nju.controller.msgqueue.operation.StartGameOperation;
import edu.nju.controller.service.SettingControllerService;

public class SettingControllerImpl implements SettingControllerService{

	@Override
	public boolean setEasyGameLevel() {
		OperationQueue.addMineOperation(new SetEasyGameOperation());
		return true;
	}

	@Override
	public boolean setHardGameLevel() {
		OperationQueue.addMineOperation(new SetHardGameOperation());
		return true;
	}

	@Override
	public boolean setHellGameLevel() {
		OperationQueue.addMineOperation(new SetHellGameOperation());
		return true;
	}

	@Override
	public boolean setCustomizedGameLevel(int height, int width, int nums) {
		OperationQueue.addMineOperation(new SetCustomGameOperation(height, width, nums));
		return true;
	}

}
