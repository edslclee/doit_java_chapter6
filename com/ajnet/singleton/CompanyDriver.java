package com.ajnet.singleton;

public class CompanyDriver {

	public static void main(String[] args) {
		
		//이 시스템에서는 company를 오직 하나만 만들 수 있다라고 가정
		//Company company = new Company();
		// Company company2 = new Company()를 만들 수 없도록 강제화
		Company c1 = Company.getInstance();
		
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
