package com.lec4.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configLocation = "classpath:lec4AppCTX.xml";
		// 스프링 컨테이너 생성
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		// 스프링 컨테이너에서 컴포넌트 가져옴
		
		// IOC (Inversion Of Control): 제어의 역전 이란 어떠한 일을  하도록 만들어진 프레임워크에 제어의 권한을 넘김으로써 
		// 클라이언트 코드가 신경 써야 할 것을 줄이는 전략
		// DI (Dependency Injection) : 내가 작성한 코드에 의존하여 주입한다.
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);  //프레임워크가 나의 클래스를 호출하여 주입하고 생성함--> 제어의 역전
		myInfo.getInfo();         							  //객체를 생성하고 조립하는 것 전부 스프링 컨테이너가 행한다.
		ctx.close();
	}
}
