package com.ajnet.interaction;

public class Student {
	String studentName;
	int grade;
	int money;
// 파란색 멤버변수, 빨간색 지역변수	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 객체의 협업
	public void takeABus(Bus bus) {
		bus.takeAPassenger(1000);
		money -= 1000;
		
	}
	
	public void takeASubway(Subway subway) {
		subway.takeAPassenger(1300);
		money -= 1300;
		
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다");
	}
}
