package com.github.bakerzhu.agent.example.removefield;

/**
 * @Description
 * @auther bozhu
 */
public class Student implements Person{

    public static String name;
    private int age;

    @Override
    public int getAge() {
        return age;
    }

    void do1(){
        System.out.println("wqwe");
    }

    @Override
    public void say() {
        System.out.println("2231");
    }
}
