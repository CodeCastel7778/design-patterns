package com.learn.patterns.factory;

public class FemalePerson implements Person {

	@Override
	public void wish(String msg) {
		System.out.println(msg);
	}

}
