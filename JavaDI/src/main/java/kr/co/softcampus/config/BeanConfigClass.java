package kr.co.softcampus.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.beans.DataBean1;
import kr.co.softcampus.beans.DataBean2;
import kr.co.softcampus.beans.DataBean3;
import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;

@Configuration //컨테이너 생성
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1(200, "문자열2", new DataBean1());
		return t1;
	}
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t1 = new TestBean1();
		t1.setData1(100);
		t1.setData2("문자열");
		t1.setData3(new DataBean1());
		return t1;
	}
	
	@Bean
	public DataBean2 data1() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	//인스턴스 만든 다음에 주입해야 한다. 참조변수 이름으로 빈 메소드 설정하고, autowire한다.
	@Bean(autowire = Autowire.BY_NAME)
	public TestBean2 java3() {
		return new TestBean2();
	}
	
	
	@Bean
	public DataBean3 data3() {
		return new DataBean3();
	}
	@Bean(autowire = Autowire.BY_TYPE)
	public TestBean3 java4() {
		return new TestBean3();
	}
	
}
//autowire 속성을 활용하여 자동 주입을 설정할 수 있다.