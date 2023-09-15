package com.learn.patterns.factory;

public class Gender {

	public Person wish(String msg) {
		Person person = PersonFactory.wish(msg);
		person.wish(msg);
		return person;
	}

}
