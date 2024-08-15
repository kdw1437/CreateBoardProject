package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;
import kr.co.softcampus.beans.TestBean4;

@Configuration //이 자바 파일이 beans.xml파일의 역할을 해주게 된다.
public class BeanConfigClass {

		//메소드의 이름이 bean의 아이디가 된다.
		@Bean //여기에서 bean을 정의함. 이 메소드에서 반환하는 주소값을 스프링 프레임워크가 가지고 있게 된다.
		public TestBean1 java1() {
			TestBean1 t1 = new TestBean1();
			return t1;
		}
		
		@Bean(name = "java600")
		public TestBean1 java500() {
			TestBean1 t1 = new TestBean1();
			return t1;
		}
		
		@Bean
		@Lazy
		public TestBean2 java2() {
			TestBean2 t2 = new TestBean2();
			return t2;
		}
		
		@Bean
		@Scope("prototype")
		public TestBean3 java3() {
			TestBean3 t3 = new TestBean3();
			return t3;
		}
		
		@Bean
		public TestBean4 java4() {
			TestBean4 t4 = new TestBean4();
			return t4;
		}
		
		@Bean
		@Primary
		public TestBean4 java5() {
			TestBean4 t4 = new TestBean4();
			return t4;
		}
}
