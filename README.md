# SpringLecture  (Seoul Wiz 스프링 강의 정리)

Spring 기본강의 2강

*DI (dependency Injection) 와 IOC 컨테이너

A 객체 안에서도 여러 객체들을 사용하게 된다.
방법1) A객체 안에서 다른 객체들을 생성하고 사용한다. (new 연산자 - 다른 객체를 사용 시 일일이 생성해줘야하기때문에 비추)
방법2) A객체의 세터나 생성자로 다른 객체들을 받아서 사용한다. (더 선호하는 방법)
	-외부에서 주입해주는 방법이기 때문(spring기법 DI)

	A객체
	(setter or constructor)
	  |
	  | 주입(DI)
 -----IOC컨테이너-----
 |                   |
 |    객체B()        |
 |    객체C()        |
 |    객체D()        |
 |       ...         |    
 ---------------------
=============================================================================
Spring 기본강의 3강, 4강

*스프링을 이용한 객체 생성과 조립
xml 파일(스프링 설정파일)에 bean 형태로 객체를 생성해놓은 다음, 메인클래스에서 xml파일을 받아서 주입하는 방식을 사용함으로써 제어의 역전을 유도할 수 있다.

=============================================================================
Spring 기본강의 5강
의존관계
di 의존주입 - 생성자를 통한 방법, setter를 통한 방법이 있다.

=============================================================================
Spring 기본강의 6강
6-1. xml파일을 이용한 DI 설정 방법
DI 사용의 장점
자바파일은 수정할 필요 없이, xml파일의 수정만으로 다른 기능으로 전환이 가능하다.
* config 파일이 여러 개일 경우 나열하여 파라미터에 입력하면 된다.
* 생성자와 세터를 혼용하여 DI 할 수 있다.
* 네임스페이스 사용방법  (스키마 추가 필수 / c:변수명=“~~” )

6-2. JAVA를 이용한 DI 설정방법

xml을 통해 주입했던 것을 java를 통해 해보자
먼저 자바를 통해 DI 하기 위해선 어노테이션을 사용해야 한다

@Configuration -> ‘이 클래스는 스프링 설정에 사용되는 클래스’ 라는 의미
(클래스 바로 위에 위치)

@Bean  -> 객체 생성
public Student student1() {    //public / 반환타입 / 객체명 () {} 
	ArrayList<String> hobbys = new ArrayList<String>();
	hobbys.add("수영");
	hobbys.add("골프");

	Student student = new Student("홍길동", 20, hobbys);  //생성자 사용
	student.setHeight(177);   //setter 사용
	student setWeight(68);

	return strudent;
}
 6-3. xml과 java를 같이 사용하여 DI 하는 방법
	1. xml 파일에 java 파일을 포함시켜 사용하는 방법
	 1) xml파일에 context 스키마처리
		xmlns:context="http://www.springframework.org/schema/context"
	 2) xml파일에 java config 파일로 bean 생성
		<context:annotation-config /> 
			<bean class="com.javalec.ex.ApplicationConfig" />
	 3) 메인 클래스에서 xml파일 주입

	2. java 파일에 xml파일을 포함시켜 사용하는 방법
	 1) java 파일에 임폴트리소스 추가
		@ImportResource("classpath:applicationCTX.xml")
	 2) 메인클래스에서 java configuration 어노테이션  주입
