package kr.co.softcampus.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.co.softcampus.beans.JdbcBean;

@Component //MapperClass 빈으로 등록. RowMapper 구현. mapRow 오버라이딩 
public class MapperClass implements RowMapper<JdbcBean>{

	@Override//resultSet이라는 객체 (select해서 가져온 데이터의 집합)
	public JdbcBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		JdbcBean bean = new JdbcBean();
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}

		
}
