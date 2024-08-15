package kr.co.softcampus.beans;

public class TestBean1 {
	
	public void method1() {
		System.out.println("beans.TestBean1.method1()");
	}
	
	//오버로딩
	public void method1(int a1) {
		System.out.println("beans.TestBean1.method1(int)");
	}
	
	//오버로딩
	public void method1(String a2) {
		System.out.println("beans.TestBean1.method1(java.lang.String)");
	}
	
	public void method1(int a1, int a2) {
		System.out.println("beans.TestBean1.method1(int, int)");
	}
}
