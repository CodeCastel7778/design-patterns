package com.learn.patterns.template_method;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("Hard Disk added for Desktop.");
	}

	@Override
	public void addRam() {
		System.out.println("RAM added for Desktop.");
	}

	@Override
	public void addKeyboard() {
		System.out.println("Keyboard added for Desktop.");
	}

}
