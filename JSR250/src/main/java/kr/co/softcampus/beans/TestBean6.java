package kr.co.softcampus.beans;

import javax.annotation.Resource;

public class TestBean6 {
		
		@Resource(name = "data1")
		private DataBean1 data100;
		
		@Resource(name = "data2") //빈의 이름과 변수의 이름이 다를 경우에 사용
		private DataBean2 data200;

		public DataBean1 getData100() {
			return data100;
		}

		public DataBean2 getData200() {
			return data200;
		}
}
