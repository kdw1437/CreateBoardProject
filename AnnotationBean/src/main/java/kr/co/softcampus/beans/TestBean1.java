package kr.co.softcampus.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean1 {
	
	private int data1; //참조변수 필드값 하나
	private DataBean1 data2; //참조변수 선언 (필드 선언)
	//반드시 주입을 받아야할 프로퍼티가 있다고 한다면 @required는 더 이상 사용하지 않고, 생성자를 통한 주입이 쓰인다.
//	public TestBean1(int data1) {
//		this.data1 = data1;
//	}
	
	//자동 주입(Autowired)를 변수에 설정한다.
	//자동으로 setter 메소드가 추가되어 setter 메소드를 통해 주입 받게 된다.
	
	@Autowired
	private DataBean1 data3;
	
	@Autowired
	@Qualifier("obj4")
	private DataBean2 data4;
	
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;
	
	@Autowired(required = false) //참조변수 타입
	@Qualifier("obj6") //참조변수
	private DataBean2 data6;
	
	public int getData1() {
		return data1;
	}

	public DataBean2 getData6() {
		return data6;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public DataBean1 getData2() {
		return data2;
	}
	//자동주입 (타입) DataBean1타입 객체를 찾아서 주입하게 된다.
	@Autowired
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	public DataBean1 getData3() {
		return data3;
	}

	public DataBean2 getData4() {
		return data4;
	}

	public DataBean2 getData5() {
		return data5;
	}
	
	
	
}
