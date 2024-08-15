package kr.co.softcampus.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.mapper.MapperInterface;

@Configuration
@ComponentScan(basePackages="kr.co.softcampus.beans")
public class BeanConfigClass {

	//data source
	@Bean
	public BasicDataSource source() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521/orclpdb");
		source.setUsername("OT");
		source.setPassword("1437");
		
		return source;
	}
	
	//SqlSessionFactory: jdbc를 처리하는 객체 (개발자가 만들어 놓은 query를 관리하는 Mapper를 만들어 주면 된다.)
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(source);
		SqlSessionFactory factory = factoryBean.getObject();
		return factory;
	}
	
	
	//Mapper Interface가 많으면 이 메소드를 여러개 만들어주면 된다.
	@Bean
	public MapperFactoryBean<MapperInterface> test_mapper(SqlSessionFactory factory) throws Exception {
		MapperFactoryBean<MapperInterface> factoryBean = new MapperFactoryBean<MapperInterface>(MapperInterface.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
}
