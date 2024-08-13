package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorld;
import kr.co.softcampus.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hello1 = new HelloWorldKo(); //인터페이스 참조변수 이용
		callMethod(hello1);
		
		HelloWorld hello2 = new HelloWorldKo();
		callMethod(hello2);
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}//오버라이딩한 메소드가 호출이 됨

}
//다형성 개념을 사용하면 클래스가 변경되었을 때 참조변수 선언 부분은 수정하지 않아도 되지만
//객체를 생성하는 부분의 코드는 변경되어야 한다.

//스프링 프레임워크 사용은 xml을 이용하는 방법과 자바 어노테이션을 이용하는 방법 두가지로 구분할 수 있다.