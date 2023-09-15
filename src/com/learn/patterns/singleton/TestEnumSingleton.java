package com.learn.patterns.singleton;

public class TestEnumSingleton {

	public static void main(String[] args) {
		EnumSingleton instance = EnumSingleton.INSTANCE;
		System.out.println(instance.getName());
		instance.setName("Enum Singleton");
		System.out.println(instance.getName());
	}

}
