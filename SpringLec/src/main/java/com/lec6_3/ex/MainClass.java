package com.lec6_3.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

		public static void main(String[] args) {
			//XML 파일과 JAVA 파일을 함께 사용하는 방법  
			//방법1. XML 파일 안에 JAVA config 파일을 담아서(bean 생성) 함께 주입한다
			AbstractApplicationContext ctx1 = new GenericXmlApplicationContext("classpath:lec6_3AppCTX1.xml");
			//방법2. java파일 안에 어노테이션을 통해 xml config 파일을 담아서  함께 주입한다.
			AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//			xml 파일만 주입하지만 그 xml 파일 안에 java config 파일이 들어있기 때문에 같이 주입된다.
			
			
			Student student1 = ctx1.getBean("student1", Student.class);
			System.out.println("이름 : " + student1.getName());
			System.out.println("나이 : " + student1.getAge());
			System.out.println("취미 : " + student1.getHobbys());
			System.out.println("키 : " + student1.getHeight());
			System.out.println("몸무게 : " + student1.getWeight());
			
			Student student2 = ctx1.getBean("student2", Student.class);
			System.out.println("이름 : " + student2.getName());
			System.out.println("나이 : " + student2.getAge());
			System.out.println("취미 : " + student2.getHobbys());
			System.out.println("키 : " + student2.getHeight());
			System.out.println("몸무게 : " + student2.getWeight());
			
			ctx1.close();
			
			
			Student student3 = ctx2.getBean("student1", Student.class);
			System.out.println("이름 : " + student1.getName());
			System.out.println("나이 : " + student1.getAge());
			System.out.println("취미 : " + student1.getHobbys());
			System.out.println("키 : " + student1.getHeight());
			System.out.println("몸무게 : " + student1.getWeight());
			
			Student student4 = ctx2.getBean("student2", Student.class);
			System.out.println("이름 : " + student2.getName());
			System.out.println("나이 : " + student2.getAge());
			System.out.println("취미 : " + student2.getHobbys());
			System.out.println("키 : " + student2.getHeight());
			System.out.println("몸무게 : " + student2.getWeight());
			
			ctx1.close(); //방법1
			ctx2.close(); //방법2
		}
	
}
