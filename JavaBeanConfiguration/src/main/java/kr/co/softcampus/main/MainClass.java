package kr.co.softcampus.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;
import kr.co.softcampus.beans.TestBean4;
import kr.co.softcampus.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//configuration annotation이 붙으면 bean.xml역할을 하는 java파일이다.
		//xml을 사용하는 방식 (xml사용해서 bean 컨테이너 생성)
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean1 xml1 = ctx1.getBean("xml1", TestBean1.class);
		System.out.printf("xml1 : %s\n", xml1);
		
		TestBean1 xml11 = ctx1.getBean("xml1", TestBean1.class);
		System.out.printf("xml11 : %S\n", xml11);
		
		
		System.out.println("----------------------------------------------");
		TestBean2 xml2 = ctx1.getBean("xml2", TestBean2.class);
		System.out.printf("xml2 : %s\n", xml2);
		
		TestBean2 xml22 = ctx1.getBean("xml2", TestBean2.class);
		System.out.printf("xml22 : %s\n", xml22);
		
		System.out.println("-----------------------------------------------");
		
		TestBean3 xml3 = ctx1.getBean("xml3", TestBean3.class);
		System.out.printf("xml3 : %S\n", xml3);
		
		TestBean3 xml33 = ctx1.getBean("xml3", TestBean3.class);
		System.out.printf("xml33 : %s\n", xml33);
		
		TestBean4 t4 = ctx1.getBean(TestBean4.class);
		System.out.printf("t4 : %s\n", t4);
		
		ctx1.close();
		//자바 파일을 사용하는 방식 (자바 파일 사용해서 bean 컨테이너 생성)
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1 = ctx2.getBean("java1", TestBean1.class);
		System.out.printf("java1 : %s\n", java1);
		
		TestBean1 java11= ctx2.getBean("java1", TestBean1.class);
		System.out.printf("java11 : %S\n", java11);
		
		TestBean1 java500 = ctx2.getBean("java600", TestBean1.class);
		System.out.printf("java500 : %s\n", java500);
		
		System.out.println("----------------------------------------------");
		
		TestBean2 java2 = ctx2.getBean("java2", TestBean2.class);
		System.out.printf("java2 : %s\n", java2);
		
		TestBean2 java22 = ctx2.getBean("java2", TestBean2.class);
		System.out.printf("java22 : %s\n", java22);
		
		System.out.println("-------------------------------------------------");
		
		TestBean3 java3 = ctx2.getBean("java3", TestBean3.class);
		System.out.printf("java3 : %s\n", java3);
		
		TestBean3 java33 = ctx2.getBean("java3", TestBean3.class);
		System.out.printf("java33 : %s\n", java33);
		
		ctx2.close();
	}

}
//Lazy-init: xml을 로딩할 때, 객체를 생성하는 것이 아니라, getBean메소드를 호출할 때, 객체를 생성한다. (싱글톤)
//같은 class의 bean이 하나 밖에 없을 시에는 id가 필요없다.