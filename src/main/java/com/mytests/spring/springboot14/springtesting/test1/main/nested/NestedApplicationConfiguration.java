package com.mytests.spring.springboot14.springtesting.test1.main.nested;

import com.mytests.spring.springboot14.springtesting.test1.beans.B1;
import com.mytests.spring.springboot14.springtesting.test1.beans.B3;
import com.mytests.spring.springboot14.springtesting.test1.beans.B4;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/23/2017.
 * Project: springboottest-test1
 * *******************************
 */
@SpringBootConfiguration
//@SpringBootApplication
public class NestedApplicationConfiguration {

    @Bean
    public B4 b4() {
        return new B4("b4 from NestedApplicationConfiguration");
    }
    @Bean
    public B1 b1() {
        return new B1("b1 from NestedApplicationConfiguration");
    }
}
