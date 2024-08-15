package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.bean2.TestBean4;
import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;

@Configuration
//지정된 패키지의 Bean 클래스들의 어노테이션을 분석하여 Bean을 등록하라고 지정한다.
@ComponentScan(basePackages = "kr.co.softcampus.bean2")
@ComponentScan(basePackages = "kr.co.softcampus.beans3")
public class BeanConfigClass {

	
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	
	@Bean //메소드의 이름이 Bean의 이름이 된다.
	public TestBean2 java3() {
		return new TestBean2();
	}
	//component는 여러 이름으로 빈을 정하는 것이 불가능하다. (하나의 클래스는 하나의 빈 객체) 고로 하나의 클래스로 여러 객체를 만들 시에는 beanConfigClass파일을 이용해야 한다.
	@Bean
	public TestBean4 java100() {
		return new TestBean4();
	}
	
	@Bean
	public TestBean4 java200() {
		return new TestBean4();
	}
}
