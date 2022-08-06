package com.solid.liskovsubstitutionprinciple;

public class Rectangle implements IShape {
	private Integer higth;
	private Integer width;

	public Rectangle(Integer higth, Integer width) {
		this.higth = higth;
		this.width = width;
	}

	public Integer getHigth() {
		return higth;
	}

	public void setHigth(Integer higth) {
		this.higth = higth;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	@Override
	public Integer computeArea() {
		return higth * width;
	}
}