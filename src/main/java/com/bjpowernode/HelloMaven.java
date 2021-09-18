package com.bjpowernode;

/**
 * @author 小小程序员
 * @date 2021/8/6 - 14:40
 */
public class HelloMaven {
    public int add(int n1,int n2){
        return n1+n2;
    }

    public static void main(String[] args) {
        HelloMaven hello=new HelloMaven();
        int res=hello.add(10,20);
        System.out.println("10+20=" + res);
    }
}
