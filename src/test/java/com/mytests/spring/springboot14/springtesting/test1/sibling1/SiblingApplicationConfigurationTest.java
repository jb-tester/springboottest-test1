package com.mytests.spring.springboot14.springtesting.test1.sibling1;

import com.mytests.spring.springboot14.springtesting.test1.beans.B1;
import com.mytests.spring.springboot14.springtesting.test1.beans.B3;
import com.mytests.spring.springboot14.springtesting.test1.sibling1.sibling_components.Comp1_siblingContext;
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
public class SiblingApplicationConfigurationTest {
    @Autowired(required = false) // should not be autowired -- ok
    private B1 b1;

    @Autowired  // should be found
    private B3 b3;

    @Autowired // should be found
    private Comp1_siblingContext comp1SiblingContext;

    @Test
    public void testComponent() throws Exception {
        Assert.assertNotNull(comp1SiblingContext);
    }

    @Test
    public void testB3() throws Exception {
        Assert.assertEquals(b3.getId(),"b3 from ApplicationConfiguration2");
    }

    @Test
    public void testB1() throws Exception {
        Assert.assertNull(b1);
    }
}