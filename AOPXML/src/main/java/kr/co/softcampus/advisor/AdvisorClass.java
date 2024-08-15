package kr.co.softcampus.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	public int aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("aroundMethod 호출1");
		
		//원래의 메서드를 호출한다. (모든 타입의 반환값을 받을 수 있다.)
		int a1 = (Integer)pjp.proceed(); //proceed는 object를 반환하기 때문에 형변환 해주어야 한다.
		
		System.out.println("aroundMethod 호출2");
	
		return a1;
	}
	
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 호출");
	}
	
	public void afterThrowingMethod(Throwable e1) {
		System.out.println("afterThrowingMethod 호출");
		System.out.println(e1);
	}
}
