package com.lec6_2.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   //IoC 컨테이너 역할을 하겠다  이 클래스는 스프링 설정에 사용되는 클래스’ 라는 의미
public class ApplicationConfig {


	@Bean   //객체 생성
	public Student student1() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("골프");
		
		Student student1 = new Student("홍길동", 10, hobbys);
		student1.setHeight(180);
		student1.setWeight(75);
		
		
		return student1;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("테니스");
		hobbys.add("축구");
		
		Student student2 = new Student("홍길은", 20, hobbys);
		student2.setHeight(177);
		student2.setWeight(70);
		
		
		return student2;
				
	}
	
}
