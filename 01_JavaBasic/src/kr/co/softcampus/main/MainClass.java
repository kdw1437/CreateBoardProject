package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorldEn;
import kr.co.softcampus.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HelloWorldEn hello1 = new HelloWorldEn();
		HelloWorldKo hello1 = new HelloWorldKo();
		callMethod(hello1);
		
		//HelloWorldEn hello2 = new HelloWorldEn();
		HelloWorldKo hello2 = new HelloWorldKo();
		callMethod(hello2);
	}
	
	//public static void callMethod(HelloWorldEn hello) {
	public static void callMethod(HelloWorldKo hello) {
		hello.sayHello();
	}

}
//자바 프로젝트에서 클래스가 변경되면 객체 생성 부붑ㄴ과 참조 변수 선언 부분 모두를 수정해야 한다.
//다형성: 자바에서의 모든 객체는 부모클래스형 참조변수나 구현한 인터페이스 변수에 담을 수 있다.