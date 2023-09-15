package com.learn.patterns.adapter;

public class WeatherAdapter {

	public int findTemperature(int zipcode) {
		String city = null;
		if (zipcode == 500079) {
			city = "Karmanghat";
		}
		WeatherFinder finder = new WeatherFinderImpl();
		return finder.find(city);
	}

}
