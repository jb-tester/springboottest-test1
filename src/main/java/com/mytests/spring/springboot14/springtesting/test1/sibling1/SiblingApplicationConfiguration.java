package com.mytests.spring.springboot14.springtesting.test1.sibling1;

import com.mytests.spring.springboot14.springtesting.test1.beans.B3;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/23/2017.
 * Project: springboottest-test1
 * *******************************
 */
@SpringBootConfiguration
@ComponentScan
//@SpringBootApplication
public class SiblingApplicationConfiguration {

    @Bean
    public B3 b3() {
        return new B3("b3 from ApplicationConfiguration2");
    }
}
