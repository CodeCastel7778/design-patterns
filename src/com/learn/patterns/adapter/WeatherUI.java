package com.learn.patterns.adapter;

public class WeatherUI {

	public void showTemperature(int zipcode) {
		WeatherAdapter adapter = new WeatherAdapter();
		int temperature = adapter.findTemperature(zipcode);
		System.out.println(temperature);
	}

	public static void main(String[] args) {
		WeatherUI ui = new WeatherUI();
		ui.showTemperature(500079);
	}

}
