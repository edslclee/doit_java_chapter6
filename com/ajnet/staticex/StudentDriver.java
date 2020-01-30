package com.ajnet.staticex;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Student.getSerialNumber());
		Student std1 = new Student();
		System.out.println(std1.studentID);
		
		Student std2 = new Student();
		System.out.println(std2.studentID);
		
		System.out.println(Student.getSerialNumber());
		
	}

}
