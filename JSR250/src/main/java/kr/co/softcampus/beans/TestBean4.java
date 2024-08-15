package kr.co.softcampus.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean4 {

	@Autowired
	@Qualifier("data1") //변수의 이름과는 무관하다. beanConfig파일에서 정의된 메소드명, 혹은 이름이 이용된다. 생성된 bean이 주입된다.
	private DataBean1 data1;
	
	@Autowired
	@Qualifier("data2")
	private DataBean2 data2;

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
	
	
}
