package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;

@Component //Component Scan 해버리면 빈으로 등록됨
public class TestBean1 {
	
	public void method1() throws Exception {
		System.out.println("TestBean1의 method1 호출");
		
		//int a1 = 10 / 0;
	}
}
