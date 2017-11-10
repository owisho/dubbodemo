package per.owisho.learn.dubboservicedemo;

import java.io.IOException;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

import per.owisho.learn.dubbointerdemo.DemoService;
import per.owisho.learn.dubboservicedemo.impl.DemoServiceImpl;

public class DemoServiceAPIImpl {

	public static void main(String[] args) throws IOException {
		
		DemoServiceImpl demoService = new DemoServiceImpl();
		ApplicationConfig application = new ApplicationConfig();
		application.setName("demo-provider");
		
		RegistryConfig registry = new RegistryConfig();
		registry.setProtocol("multicast");
		registry.setAddress("224.5.6.7");
		registry.setPort(1234);
		
		ProtocolConfig protocol = new ProtocolConfig();
		protocol.setName("dubbo");
		protocol.setPort(12345);
		protocol.setThreads(200);
		
		ServiceConfig<DemoService> service = new ServiceConfig<>();
		service.setApplication(application);
		service.setRegistry(registry);
		service.setProtocol(protocol);
		service.setInterface(DemoService.class);
		service.setRef(demoService);
		
		service.export();
		
		System.in.read();
	}
	
}
