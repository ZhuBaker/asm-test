package com.github.bakerzhu.agent.example.javap.方法调用;

/**
 * @Description
 * @auther bozhu
 */
public class VirtualTest {
    static abstract class Humnan {}
    static class Man extends Humnan {}
    static class Woman extends Humnan {}
    public void hello(Humnan guy) {
        System.out.println("hello, Humnan");
    }
    public void hello(Man guy) {
        System.out.println("hello, Man");
    }
    public void hello(Woman guy) {
        System.out.println("hello, Woman");
    }
    public static void main(String[] args) {
        Humnan man = new Man();
        Humnan woman = new Woman();
        VirtualTest virtualTest = new VirtualTest();
        virtualTest.hello(man);
        virtualTest.hello(woman);
    }
/**
Code:
 0: new           #7   创建Man实例并压栈 // class com/github/bakerzhu/agent/example/javap/VirtualTest$Man
 3: dup                创建栈顶元素副本并压栈
 4: invokespecial #8   取出栈顶Man副本并调用<init>方法 // Method com/github/bakerzhu/agent/example/javap/VirtualTest$Man."<init>":()V
 7: astore_1           将栈顶元素存入局部变量表
 8: new           #9   创建Woman实例并压栈 // class com/github/bakerzhu/agent/example/javap/VirtualTest$Woman
 11: dup               创建栈顶元素Woman副本并压栈
 12: invokespecial #10 取出栈顶Woman副本并调用<init>方法// Method com/github/bakerzhu/agent/example/javap/VirtualTest$Woman."<init>":()V
 15: astore_2          将栈顶元素存入局部变量表
 16: new           #11 创建VirtualTest实例并压栈 // class com/github/bakerzhu/agent/example/javap/VirtualTest
 19: dup               创建栈顶元素VirtualTest副本并压栈
 20: invokespecial #12 取出栈顶VirtualTest副本并调用<init>方法   // Method "<init>":()V
 23: astore_3          将栈顶元素存入局部变量表3
 24: aload_3           读取局部变量表3 virtualTest 并压栈
 25: aload_1           读取局部变量表1 man 并压栈
 26: invokevirtual #13 // Method hello:(Lcom/github/bakerzhu/agent/example/javap/VirtualTest$Humnan;)V
 29: aload_3
 30: aload_2
 31: invokevirtual #13                 // Method hello:(Lcom/github/bakerzhu/agent/example/javap/VirtualTest$Humnan;)V
 34: return
 */
}
