package com.dheeraj.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	List<Observer> subscriberList = new ArrayList<>();

	@Override
	public void subscribe(Observer obs) {
		subscriberList.add(obs);

	}

	@Override
	public void unSubscribe(Observer obs) {
		subscriberList.remove(obs);

	}

	@Override
	public void notifyUpdate(Message msg) {

		for (Observer observerObj : subscriberList) {
			observerObj.update(msg);
		}

	}

}
