package per.owisho.learn.dubboclientdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.owisho.learn.dubbointerdemo.CallbackListener;
import per.owisho.learn.dubbointerdemo.CallbackService;

public class CallbackServiceConsumer {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-demo-consumer.xml");
		context.start();
		
		CallbackService callbackService = context.getBean(CallbackService.class);
		callbackService.addListener("http://www.baidu.com", new CallbackListener() {
			@Override
			public void changed(String msg) {
				System.out.println("callback:"+msg);
			}
		});
		
		
	}
	
}
