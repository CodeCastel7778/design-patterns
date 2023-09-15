package com.learn.patterns.abstract_factory;

public class DaoFactoryProducer {

	public static DaoAbstractFactory produce(String factoryType) {
		DaoAbstractFactory dao = null;
		if (factoryType.equals("xml")) {
			dao = new XMLDaoFactory();
		} else if (factoryType.equals("db")) {
			dao = new DBDaoFactory();
		}
		return dao;
	}

}
