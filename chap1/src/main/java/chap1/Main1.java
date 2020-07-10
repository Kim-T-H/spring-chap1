package chap1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=	//container
					new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Greeter g=ctx.getBean("greeter",Greeter.class);	//greeter 인 객체를 가져와
		System.out.println(g.greet("스프링"));
		Message m =ctx.getBean("message",Message.class);		//m: MessagerKr 객체
		m.sayHello("홍길동");
		m.sayHello("HongKilDong");
		//container 로부터 message 객체를 가져와 => sayHello 라는 메서드를 호출

		Greeter g2 =ctx.getBean("greeter",Greeter.class);
		if(g==g2)
			System.out.println("g 참조변수 객체와 g2참조변수 객체는 같은 객체임."); //한번 만들어 놓은 객체를 계속 사용할 수 있음.
	}

}
