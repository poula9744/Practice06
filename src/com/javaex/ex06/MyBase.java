package com.javaex.ex06;

public class MyBase extends Base{

    //코드작성

	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}
	public void night() {
		System.out.println("밤에는 숙면");
	}
	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
	
	
	public void service() {
		if(super.equals("낮")) {
			day();
		} else if(super.equals("밤")) {
			night();
		} else if (super.equals("오후")){ //오후 고치기
			afternoon();
		}
	}
	
}
