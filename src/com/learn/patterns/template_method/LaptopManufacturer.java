package com.learn.patterns.template_method;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("Hard Disk added for Laptop.");
	}

	@Override
	public void addRam() {
		System.out.println("RAM added for Laptop.");
	}

	@Override
	public void addKeyboard() {
		System.out.println("Keyboard added for Laptop.");
	}

}
