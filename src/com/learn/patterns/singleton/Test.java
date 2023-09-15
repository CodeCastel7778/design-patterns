package com.learn.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		DateUtil dateUtil1 = DateUtil.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				new File("/Users/jayanth_kumar/Code/Resources/DesignPatterns/Singleton/dateUtil.ser")));
		oos.writeObject(dateUtil1);

		DateUtil dateUtil2 = DateUtil.getInstance();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				new File("/Users/jayanth_kumar/Code/Resources/DesignPatterns/Singleton/DateUtil.ser")));
		dateUtil2 = (DateUtil) ois.readObject();

		oos.close();
		ois.close();

		System.out.println(dateUtil1 == dateUtil2);
		
		Logger logger1 = Logger.getInstance();
		logger1.log("hello");
		Logger logger2 = Logger.getInstance();
		logger2.log("world!");
		
		System.out.println(logger1 == logger2);
	}

}
