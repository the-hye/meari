package com.ktds.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//WEB MVC 설정을 유지하고 기능을 확장하기 위한 클래스
@Configuration
public class MvcConfiguration implements WebMvcConfigurer {

	
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**") // /를 시작하는 하는 모든 요청을 다룬다
				.addResourceLocations("classpath:/templates/", "classpath:/static/") // 18번 코드를 처리할 자원을 찾을 위치를 나타낸다
				.setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES)); // 이에 대한 Cache는 10분으로 설정한다
		}
}


