package kr.co.softcampus.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.co.softcampus.beans.DataBean1;
import kr.co.softcampus.beans.DataBean2;
import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;
import kr.co.softcampus.beans.TestBean4;
import kr.co.softcampus.beans.TestBean5;
import kr.co.softcampus.beans.TestBean6;

@Configuration //IoC 컨테이너 정의
public class BeanConfigClass {

	@Bean(initMethod = "init1", destroyMethod = "destroy1") //컨테이너에 빈 생성 (객체 생성)
	@Lazy //getBean할 때, 객체가 만들어지도록 함
	public TestBean1 obj1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	@Lazy
	public TestBean2 obj2() {
		return new TestBean2();
	}
	
	@Bean
	public DataBean1 data1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public TestBean3 obj3() {
		return new TestBean3();
	}
	
	@Bean
	public TestBean4 obj4() {
		return new TestBean4();
	}
	
	@Bean
	public TestBean5 obj5() {
		
		return new TestBean5();
	}
	
	@Bean
	public TestBean6 obj6() {
		return new TestBean6();
	}
 }
