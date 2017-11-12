package per.owisho.learn.dubboservicedemo.annotation.impl;

import com.alibaba.dubbo.config.annotation.Service;

import per.owisho.learn.dubbointerdemo.DemoAnnotationService;

@Service(version="1.0.0")
public class DemoAnnotationServiceImpl implements DemoAnnotationService{

	@Override
	public String sayHello(String name) {
		return "hello"+name;
	}

}
