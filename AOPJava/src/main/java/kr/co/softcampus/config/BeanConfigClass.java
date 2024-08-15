package kr.co.softcampus.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //ioc설정
@ComponentScan(basePackages = {"kr.co.softcampus.beans", "kr.co.softcampus.advisor"}) //Component @이 있는 클래스를 bean으로 등록한다.
@EnableAspectJAutoProxy
public class BeanConfigClass {

}

//@AspectJ 어노테이션을 활용하여 Bean에 Advisor를 설정할 수 있다.