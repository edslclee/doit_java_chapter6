package com.ajnet.singleton;

public class Company {
	
	// Company instance를 이곳에 정의하여 인스턴스를 생성하는데 변경이 불가능하도록 private, 유일하도록 static으로 정의
	private static Company instance = new Company();
	
	//Constructor에서 private으로 선언
	private Company(){
		
	}
	
	//일반 method일 경우 객체를 생성하고 나서 이 method를 부를 수 있다. 그래서 객체 생성전에라도 불러다 쓸 수 있도록 public static으로 지정  
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
