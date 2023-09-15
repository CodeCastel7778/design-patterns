package com.learn.patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {

	public static void main(String[] args) {
		DateUtil dateUtil1 = DateUtil.getInstance();
		DateUtil dateUtil2 = null;

		Constructor<?>[] constructors = DateUtil.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			try {
				dateUtil2 = (DateUtil) constructor.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
			break;
		}

		System.out.println(dateUtil1.hashCode());
		System.out.println(dateUtil2.hashCode());
	}

}
