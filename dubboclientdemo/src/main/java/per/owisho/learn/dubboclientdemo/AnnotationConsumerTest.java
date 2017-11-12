package per.owisho.learn.dubboclientdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.owisho.learn.dubbointerdemo.DemoAnnotationService;

public class AnnotationConsumerTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-demo-consumer.xml");
		context.start();
		AnnotationConsumer annotationConsumer = context.getBean(AnnotationConsumer.class);
		DemoAnnotationService demoAnnotationService = annotationConsumer.getDemoAnnotationService();
		String hello = demoAnnotationService.sayHello(" world");
		System.out.println(hello);
		
	}
	
}
