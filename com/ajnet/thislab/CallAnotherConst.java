package com.ajnet.thislab;

class Person{
	
	String name;
	int age;
	
	public Person(){
/*
 * 생성자가 여러개 있는 경우    
 * 인스턴스 생성 시 정의를 하여야 하나
 * 아래와 같이 this("",)로 초기화 할 수 있다.
 */
		this("이름 없음",1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person("이철", 58);
		
		System.out.println(p1.name + p1.age);
		System.out.println(p2.name + p2.age);
		
	}

}
