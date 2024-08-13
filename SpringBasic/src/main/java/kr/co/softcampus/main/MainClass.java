package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//beans.xml 파일을 로딩한다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		//xml에 정의한 bean 객체의 주소값을 가져온다.
		HelloWorld hello1 = (HelloWorld)ctx.getBean("hello");
		callMethod(hello1);
		
		HelloWorld hello2 = ctx.getBean("hello", HelloWorld.class);
		callMethod(hello2);
		ctx.close();
		
		
		
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
//IOC개념을 적용한 개발 방식은 개발자가 몇가지만 세팅만 해놓으면 흐름은 프레임워크가 제어한다.
//POJO(Plain Old Java Object): 자바 bean
//자바 모델이나 기능 프레임워크 등에 따르지 않고 홀로 독립적이며 단순한 기능만을 가진 객체

//IOC컨테이너의 종류: BeanFactory, ApplicationContext