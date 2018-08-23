package com.lec3.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String configLoc = "classpath:lec3AppCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		//객체 생성
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.multi();
		myCalculator.div();
		
	}

}
