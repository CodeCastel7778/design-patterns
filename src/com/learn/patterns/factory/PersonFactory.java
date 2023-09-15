package com.learn.patterns.factory;

public class PersonFactory {

	public static Person wish(String msg) {
		Person person = null;
		if (msg.equals("male")) {
			person = new MalePerson();
		} else if (msg.equals("female")) {
			person = new FemalePerson();
		}
		return person;
	}

}
