package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@RestController
@MapperScan("com.example.demo.dao")
public class ClientApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}



	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("client:9002----running");
		//传入SpringBoot应用的主程序
		return application.sources(ClientApplication.class);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
		return "hi " + name + " ,i am from port:" + port;
	}

}
