package com.dheeraj.observer;

public interface Subject {

	public void subscribe(Observer obs);

	public void unSubscribe(Observer obs);

	public void notifyUpdate(Message msg);

}
