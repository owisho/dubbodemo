package per.owisho.learn.dubboservicedemo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-demo-provider.xml");
		context.start();
		System.in.read();
		
	}
	
}
