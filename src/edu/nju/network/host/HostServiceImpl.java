package edu.nju.network.host;

import java.io.ObjectOutputStream;
import java.util.Observable;

import edu.nju.model.impl.UpdateMessage;
import edu.nju.network.TransformObject;

public class HostServiceImpl extends HostService {

	@Override
	public void update(Observable o, Object arg) {
		UpdateMessage msge = (UpdateMessage) arg;
		String trigger_class = o.getClass().getName();
		TransformObject obj = new TransformObject(trigger_class, msge);
		this.publishData(obj);
	}

	@Override
	public void publishData(TransformObject o) {
		ServerAdapter.write(o);
	}
}
