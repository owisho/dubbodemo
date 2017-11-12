package per.owisho.learn.dubboclientdemo;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import per.owisho.learn.dubbointerdemo.DemoAnnotationService;

@Component
public class AnnotationConsumer {

	@Reference(version="1.0.0")
	private DemoAnnotationService demoAnnotationService;
	
	public DemoAnnotationService getDemoAnnotationService() {
		return demoAnnotationService;
	}

}
