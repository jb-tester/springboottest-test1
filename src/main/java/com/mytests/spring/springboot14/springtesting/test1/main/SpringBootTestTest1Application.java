package com.mytests.spring.springboot14.springtesting.test1.main;

import com.mytests.spring.springboot14.springtesting.test1.beans.B1;
import com.mytests.spring.springboot14.springtesting.test1.beans.B2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootTestTest1Application {



	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestTest1Application.class, args);
	}


	@Bean
	public B1 b1() {
		return new B1("b1 from main");
	}
	@Bean
	public B2 b2() {
		return new B2("b2 from main");
	}
}

