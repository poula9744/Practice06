package com.javaex.ex05;

public class Depart extends Employee{

	 //코드작성
	//필드
	private String depart;

	//생성자
	public Depart(String name, int salary, String depart) {
		super(name, salary); 
		this.depart = depart;
	}

	//메소드 - g/s
	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	//메소드 - 일반 
	public void showInformation() {
		System.out.println("이름: "+ getName() + "  연봉: " + getSalary() +  "  부서: " + depart );
	}
	
	

}
