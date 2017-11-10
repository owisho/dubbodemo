package per.owisho.learn.dubboclientdemo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;

import per.owisho.learn.dubbointerdemo.DemoService;

public class Point2PointConsumer {

	public static void main(String[] args) {
		
		ApplicationConfig application = new ApplicationConfig();
		application.setName("demo-service");
		
		ReferenceConfig<DemoService> reference = new ReferenceConfig<>();
		reference.setApplication(application);
		reference.setInterface(DemoService.class);
		reference.setUrl("dubbo://127.0.0.1:12345/per.owisho.learn.dubbointerdemo.DemoService");
		DemoService demoService = reference.get();
		String hello = demoService.sayHello("+world");
		System.out.println(hello);
	}
	
}
