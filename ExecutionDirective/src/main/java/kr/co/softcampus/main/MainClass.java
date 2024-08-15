package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean1 xml1 = ctx.getBean("xml1",TestBean1.class);
		xml1.method1();
		
		TestBean2 xml2 = ctx.getBean("xml2", TestBean2.class);
		
		kr.co.softcampus.beans2.TestBean1 xml3 = ctx.getBean("xml3", kr.co.softcampus.beans2.TestBean1.class);
		
		System.out.println("-----------------------------------------");
		//관심사로 등록되지 않은 메소드는 advisor가 weaving되지 않았다.
		
		xml1.method1(100);
		
		System.out.println("-------------------------------------------");
		
		xml1.method1("문자열");
		
		System.out.println("---------------------------------------------");
		
		xml1.method1(100, 200);
		
		System.out.println("----------------------------------------------");
		
		xml2.method1();
		
		System.out.println("------------------------------------------------");
		
		xml3.method1();
		ctx.close();
	}

}
//AOP 적용시 다양한 상황에 대응할 수 있도록 명시자를 제공하고 있다.