package per.owisho.learn.dubboclientdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.owisho.learn.dubbointerdemo.NotifyService;

public class NotifyServiceConsumer {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-demo-consumer.xml");
		context.start();
		
		NotifyService service = context.getBean(NotifyService.class);
		service.get(1);
		
	}
	
}
