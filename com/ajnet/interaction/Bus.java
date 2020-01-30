package com.ajnet.interaction;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;

	// Bus constructor
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//손님을 한명 태웠을때
	public  void takeAPassenger(int money) {
		passengerCount++;
		this.money +=money;
	}
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고 수입은 " + money + "입니다");
	}
}
