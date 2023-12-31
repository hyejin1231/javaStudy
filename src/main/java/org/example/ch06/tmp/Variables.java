package org.example.ch06.tmp;

/**
 * ch06. 선언위치 변수종류
 * 클래스 영역 - 클래스 변수(static 변수) : 클래스가 메모리에 올라갈 때 생성됨, 객체 생성 안해도 됨
 * 			 - 인스턴스 변수  : 인스턴스가 생성될 때 생성됨, 객체 생성 필요함
 * 메서드 영역 - 지역 변수 : 변수 선언문이 수행되었을 때 생성됨
 * 따라서 객체를 보면 iv를 묶어놓은 것이라고 프로그래밍적으로 볼 수도 있다.
 */
public class Variables
{
	// 클래스 영역 : 변수나 메서드 선언만 가능하다.
	int iv; // 인스턴스 변수, 인스턴스가 생성되었을 때 생성 ★
	static int cv; // 클래스 변수, static 변수, 클래스가 메모리에 올라갈 때 생성
	
	// 메서드 영역
	public void method()
	{
		int lv = 0; // 지역 변수, 변수 선언문이 수행되었을 때 생성 , 메서드 종료시 자동 제거
	}
}
