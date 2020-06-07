package com.it;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Mystack1Test {
    @Before
    public void init(){
        System.out.println("初始化语句");
    }
    @Test
    public void testPush(){
        Mystack1 mystack1 = new Mystack1();
        mystack1.push(100);
        Assert.assertEquals(100,mystack1.pop());
    }
    @After
    public void close(){
        System.out.println("释放资源");
    }
}
