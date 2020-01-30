package com.ajnet.interaction;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("이철", 1000000);
		Student std2 = new Student("이은실", 1000000);
		Bus bus100 = new Bus(100);
		Subway line1 = new Subway(1);
		std1.showInfo();
		
		std1.takeABus(bus100);
		bus100.showInfo();
		std1.takeASubway(line1);
		line1.showInfo();
		std1.showInfo();
	}

}
