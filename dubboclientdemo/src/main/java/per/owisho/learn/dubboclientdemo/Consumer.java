package per.owisho.learn.dubboclientdemo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.owisho.learn.dubbointerdemo.DemoService;

public class Consumer {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-demo-consumer.xml");
		context.start();
		DemoService demoService = context.getBean(DemoService.class);
		String hello = demoService.sayHello("world");
		System.out.println(hello);
	}
	
}
