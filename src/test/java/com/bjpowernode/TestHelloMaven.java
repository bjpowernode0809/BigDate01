package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author 小小程序员
 * @date 2021/8/6 - 14:43
 */
public class TestHelloMaven {
    @Test
    public void testadd(){
        System.out.println("=======testadd测试add方法======");
        HelloMaven hello=new HelloMaven();
        int res=hello.add(10,20);
        Assert.assertEquals(30,res);
    }
}
