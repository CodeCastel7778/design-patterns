package com.learn.patterns.flyweight;

public class Rectangle extends Shape {

	private String label;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Rectangle() {
		this.label = "Rectangle";
	}

	@Override
	public void draw(int length, int breadth, String fillStyle) {
		System.out.println(
				"Drawing a " + label + " with Length " + length + ", Breadth " + breadth + ", Fill color " + fillStyle);
	}

}
