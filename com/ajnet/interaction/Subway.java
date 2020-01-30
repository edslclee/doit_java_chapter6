package com.ajnet.interaction;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;

	// Bus constructor
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//손님을 한명 태웠을때
	public  void takeAPassenger(int money) {
		passengerCount++;
		this.money +=money;
	}
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "라인의 승객은 " + passengerCount + "명이고 수입은 " + money + "입니다");
	}
}
