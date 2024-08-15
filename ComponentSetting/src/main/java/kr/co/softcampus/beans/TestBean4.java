package kr.co.softcampus.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //getBean 메서드를 호출 할 때 마다 새로운 객체를 생성해서 반환한다.
public class TestBean4 {

	public TestBean4() {
		System.out.println("TestBean4의 생성자");
	}
}
