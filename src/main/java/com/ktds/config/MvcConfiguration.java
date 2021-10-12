package com.ktds.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//WEB MVC ������ �����ϰ� ����� Ȯ���ϱ� ���� Ŭ����
@Configuration
public class MvcConfiguration implements WebMvcConfigurer {

	
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**") // /�� �����ϴ� �ϴ� ��� ��û�� �ٷ��
				.addResourceLocations("classpath:/templates/", "classpath:/static/") // 18�� �ڵ带 ó���� �ڿ��� ã�� ��ġ�� ��Ÿ����
				.setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES)); // �̿� ���� Cache�� 10������ �����Ѵ�
		}
}


