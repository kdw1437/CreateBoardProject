package kr.co.softcampus.beans;

public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1의 생성자 입니다.");
	}
	
	public void init() {
		System.out.println("TestBean1의 init 메소드");
		
	}
	
	public void destroy() {
		System.out.println("TestBean1의 destroy 메소드");
	}
 }
