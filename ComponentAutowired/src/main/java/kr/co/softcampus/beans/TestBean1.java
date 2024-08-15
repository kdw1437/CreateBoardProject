package kr.co.softcampus.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	
	@Autowired//setter가 자동으로 만들어짐. bean객체 자동 주입
	private DataBean1 data1;

	@Autowired
	@Qualifier("obj2")//autowire시 setter가 자동으로 만들어짐.
	private DataBean2 data2;
	
	@Resource(name = "obj3")
	private DataBean3 data3;
	
	@Resource(name = "obj4")
	private DataBean3 data4;
	
	@Resource(name = "obj5")
	private DataBean3 data5;
	
	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}

	public DataBean3 getData4() {
		return data4;
	}

	public DataBean3 getData5() {
		return data5;
	}

	public DataBean3 getData3() {
		return data3;
	}
	
	
}
//AOP: 관점 지향 프로그래밍
//하나의 프로그램을 관점 이라는 논리적인 단위로 분리하여 관리하는 개념
//메소드 호출을 관심사로 설정하여 AOP에 관한 실습을 진행한다.