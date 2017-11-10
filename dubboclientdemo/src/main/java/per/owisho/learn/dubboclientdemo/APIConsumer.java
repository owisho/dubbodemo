package per.owisho.learn.dubboclientdemo;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

import per.owisho.learn.dubbointerdemo.DemoService;

public class APIConsumer {

	public static void main(String[] args) {
		ApplicationConfig application = new ApplicationConfig();
		application.setName("demo-provider");
		
		RegistryConfig registry = new RegistryConfig();
		registry.setAddress("224.5.6.7");
		registry.setProtocol("multicast");
		registry.setPort(1234);

		List<MethodConfig> methods = new ArrayList<MethodConfig>();
		MethodConfig method = new MethodConfig();
		method.setName("sayHello");
		method.setTimeout(5000);
		method.setRetries(0);
		
		ReferenceConfig<DemoService> reference = new ReferenceConfig<>();
		reference.setApplication(application);
		reference.setRegistry(registry);
		reference.setInterface(DemoService.class);
		reference.setMethods(methods);
		
		DemoService demoService = reference.get();
		String hello = demoService.sayHello(" world");
		System.out.println(hello);
		
	}
	
}
