package com.ajnet.thislab;

class Birthday {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
		
	}
	
	public void printThis() {
		System.out.println(this);
		
	}
	
}

public class ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birthday bd1 = new Birthday();
		Birthday bd2 = new Birthday();
		
		System.out.println(bd1);
		bd1.printThis();
		System.out.println("bd2 address : " + bd2);
		bd2.printThis();
	}

}
