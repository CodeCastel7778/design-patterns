package com.learn.patterns.abstract_factory;

public class XMLDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department to XML");
	}

}
