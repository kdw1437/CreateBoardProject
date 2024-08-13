package kr.co.softcampus.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test2();
		//test3();
		test4();
	}
	
	// BeanFactory 사용
	public static void test1() {
		ClassPathResource res = new ClassPathResource("kr/co/softcampus/config/beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean t1 = factory.getBean("t1", TestBean.class); //이 때 객체 생성
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2 = factory.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
	}
	
	//BeanFactory - 패키지 외부
	public static void test2() {
		//파일 시스템 밖에 있는 것 사용할 때는 FileSystemResource
		FileSystemResource res = new FileSystemResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean t1 = factory.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n", t1);
		
		TestBean t2 = factory.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
	}
	
	//AppliationContext - 패키지 내부
	public static void test3() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		ctx.close();
	}
	
	public static void test4() {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		TestBean t1 = ctx.getBean("t2", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2 = ctx.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n", t2 );
		ctx.close();
	}
}
//스프링 프레임워크는 IoC컨테이너를 이용해 Bean 객체들을 관리한다.
