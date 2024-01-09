package com.javaex.ex03;

public class Shape {
	
	//필드 : private로 되어 있으면 Triangle.java에서 바로 받지 못함. 바로 받을 수 있도록 protected로 바꾸어 준다.
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	public Shape() { //Triangle.java에서 생성자가 디폴트 값을 받아야 하는데, 다른 생성자가 정의되어 있어서 디폴트값을 따로 한 번 더 써줘야 한다.
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	//메소드 - s
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
}

