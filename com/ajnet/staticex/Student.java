package com.ajnet.staticex;

public class Student {
	//프로그램이 load될때 static변수가 memory에 잡힌다.
	// serialNumber는 Student클래스에서만 변경이 가능하도록 
	// private으로 선언
	
	private static int serialNumber = 20000;
	int studentID;
	String studentName;
	
	public Student() {
		serialNumber++;
		studentID = serialNumber;
	}
	//private로 정의했으므로 외부에서 Access불가
	//그래서 Getter 정의

	public static int getSerialNumber() {
		
		return serialNumber;
		
	}

	 	
}
