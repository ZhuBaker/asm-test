package com.github.bakerzhu.agent.example.javap.方法调用;

/**
 * @Description
 * @auther bozhu
 * @create 02\ 02\ 2019
 */
public class DynamicDispatch {
    static abstract class Human{
        protected abstract void sayHello();
    }
    static class Man extends Human{
        @Override
        protected void sayHello() {
            System.out.println("man is say hello");
        }
    }
    static class Woman extends Human{
        @Override
        protected void sayHello() {
            System.out.println("woman is say hello");
        }
    }
    public static void main(String[] args) {
        Human man=new Man();
        Human woman=new Woman();
        man.sayHello();
        woman.sayHello();
        man=new Woman();
        man.sayHello();
    }

}
