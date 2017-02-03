package com.mytests.spring.springboot14.springtesting.test1.main;

import com.mytests.spring.springboot14.springtesting.test1.beans.B1;
import com.mytests.spring.springboot14.springtesting.test1.beans.B3;
import com.mytests.spring.springboot14.springtesting.test1.beans.B4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/23/2017.
 * Project: springboottest-test1
 * *******************************
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MainTest0 {

    @Autowired
    private B1 b1;

    @Autowired(required = false)
    private B3 b3;

    @Autowired
    private B4 b4;


    @Test
    public void testB1() throws Exception {
        Assert.assertEquals(b1.getId(),"b1 from main");
    }

    @Test
    public void testB3() throws Exception {
        Assert.assertNull(b3);
    }
    @Test
    public void testB4() throws Exception {
        Assert.assertEquals(b4.getId(),"b4 from NestedApplicationConfiguration");
    }
}
