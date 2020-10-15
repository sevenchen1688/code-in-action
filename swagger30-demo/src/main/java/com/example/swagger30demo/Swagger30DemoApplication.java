package com.example.swagger30demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(tags = "测试接口")
@SpringBootApplication
public class Swagger30DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Swagger30DemoApplication.class, args);
	}

	@ApiOperation("测试请求接口")
	@RequestMapping("/sayHello")
	public String sayHello(String hello) {
		return hello;
	}
}
