package kr.co.softcampus.beans;

public class TestBean2 {

	private int data1;
	private String data2;
	private DataBean3 data3;
	private DataBean4 data4;
	
	public TestBean2(DataBean3 data3, DataBean4 data4) {
	
		this.data3 = data3;
		this.data4 = data4;
	}

	public int getData1() {
		return data1;
	}

	public String getData2() {
		return data2;
	}

	public DataBean3 getData3() {
		return data3;
	}

	public DataBean4 getData4() {
		return data4;
	}
	
	
}
