package com.learn.patterns.factory;

public class MalePerson implements Person {

	@Override
	public void wish(String msg) {
		System.out.println(msg);
	}

}
