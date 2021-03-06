package com.lec6_1.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String configLocation1 = "classpath:lec6_1AppCTX1.xml";
		String configLocation2 = "classpath:lec6_1AppCTX2.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1, configLocation2);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getHobbys());
		
		StudentInfo studentInfo = ctx.getBean("studentInfo1", StudentInfo.class);
		Student student2 = studentInfo.getStudent();
		System.out.println(student2.getName());
		System.out.println(student2.getHobbys());
		
		if(student1.equals(student2)) {
			System.out.println("student1과 student2는 같은 객체");
		}else {
			System.out.println("student1과 student2는 다른 객체");
		}
		
		Student student3 = ctx.getBean("student3", Student.class);
		System.out.println(student3.getName());
		
		Family family = ctx.getBean("family", Family.class);
		System.out.println(family.getPapaName());
		System.out.println(family.getMamaName());
		System.out.println(family.getSisName());
		System.out.println(family.getBroName());
		
		ctx.close();  //자원 해제
		
		
	}

}
