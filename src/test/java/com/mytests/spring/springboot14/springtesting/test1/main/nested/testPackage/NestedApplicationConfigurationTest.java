package com.mytests.spring.springboot14.springtesting.test1.main.nested.testPackage;

import com.mytests.spring.springboot14.springtesting.test1.beans.B1;
import com.mytests.spring.springboot14.springtesting.test1.beans.B2;
import com.mytests.spring.springboot14.springtesting.test1.beans.B4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/23/2017.
 * Project: springboottest-test1
 * *******************************
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class NestedApplicationConfigurationTest {

    @Autowired
    private B4 b4; // bean is defined in the context configuration located in the same package

    @Autowired
    private B1 b1; // bean is defined both in the context configuration located in the same package and in the parent one; only first one should be available

    @Autowired(required = false) // bean is defined only in the configuration located in the parent package - should not be available
    private B2 b2;


    @Test
    public void testB4() throws Exception {
        Assert.assertEquals(b4.getId(),"b4 from NestedApplicationConfiguration");
    }

    @Test
    public void testB1() throws Exception {
        Assert.assertEquals(b1.getId(),"b1 from NestedApplicationConfiguration");
    }

    @Test
    public void testB2() throws Exception {
        Assert.assertNull(b2);
    }
}