package per.owisho.learn.dubboservicedemo.impl;

import per.owisho.learn.dubbointerdemo.DemoService;

public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello(String name) {
		return "Hello" + name;
	}

}
