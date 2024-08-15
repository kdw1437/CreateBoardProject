package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.co.softcampus.beans.TestBean1;

@Configuration
public class BeanConfigClass {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Lazy
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
}
//initMethod와 destroyMethod를 이용하여 객체 생성 및 소멸 시 호출될 메소드를 등록할 수 있다.