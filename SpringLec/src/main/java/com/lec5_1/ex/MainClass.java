package com.lec5_1.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String configLocatioin = "classpath:lec5_1AppCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocatioin);
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class); 
		// 기본 StudentInfo 객체는 Student1객체를 참조하고 있었기 때문에 Student1의 정보가 나옴
		studentInfo.getStudentInfo();
		
		// xml에서 작성해놓은 Student2 객체를 가져옴
		Student student2 = ctx.getBean("student2", Student.class);
		// studentInfo 객체가 setter 함수를 이용하여 student2를 참조하도록 함 
		studentInfo.setStudent(student2);
		// Student2의 정보가 나옴
		studentInfo.getStudentInfo();
		
		ctx.close();
		
	}
	
}
