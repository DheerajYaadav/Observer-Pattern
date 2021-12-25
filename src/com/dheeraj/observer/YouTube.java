package com.dheeraj.observer;

public class YouTube {

	public static void main(String[] args) {

		Subscriber s1 = new Subscriber("Dheeraj");
		Subscriber s2 = new Subscriber("Ravish");

		Subscriber s3 = new Subscriber("Moks");

		Subscriber s4 = new Subscriber("Dhruv");

		Channel ch = new Channel();

		ch.subscribe(s1);
		ch.subscribe(s2);

		ch.subscribe(s3);

		ch.subscribe(s4);
		ch.unSubscribe(s4);
		ch.notifyUpdate(new Message("First Message")); // s1 and s2 will receive the update
	}

}
