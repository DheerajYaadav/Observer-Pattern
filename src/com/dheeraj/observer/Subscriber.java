package com.dheeraj.observer;

public class Subscriber implements Observer {

	
	private String name;
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	@Override
	public void update(Message msg) {

		System.out.println(this.name+ "this is the " +msg.getMessageContent());

	}

}
