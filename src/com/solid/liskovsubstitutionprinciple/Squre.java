package com.solid.liskovsubstitutionprinciple;

public class Squre implements IShape {
	private Integer side;

	public Squre(Integer side) {
		this.side = side;
	}

	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}

	@Override
	public Integer computeArea() {
		return side * side;
	}
}
