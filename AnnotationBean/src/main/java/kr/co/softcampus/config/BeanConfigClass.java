package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.beans.DataBean1;
import kr.co.softcampus.beans.DataBean2;
import kr.co.softcampus.beans.TestBean1;

@Configuration //컨테이너 지정
public class BeanConfigClass {

	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean//autowired(타입 보고 주입)이 일어나려면 객체가 있는 것이 선행되어야 한다.
	public DataBean1 data_bean1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean2 obj4() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 obj5() {
		return new DataBean2();
	}
}
