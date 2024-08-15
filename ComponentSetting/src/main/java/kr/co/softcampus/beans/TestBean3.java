package kr.co.softcampus.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //getBean할 때, 빈이 생성됨 (getBean메서드를 호출 할 때, 객체가 생성된다.) Singleton
public class TestBean3 {

	public TestBean3() {
		System.out.println("TestBean3의 생성자");
	}
}
