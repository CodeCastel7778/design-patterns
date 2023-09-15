package com.learn.patterns.template_method;

public class TestApp {

	public static void main(String[] args) {
//		DataRenderer dataRenderer = new CSVDataRenderer();
//		dataRenderer.render();
		
		ComputerManufacturer manufacturer = new DesktopManufacturer();
		manufacturer.buildComputer();
	}

}
