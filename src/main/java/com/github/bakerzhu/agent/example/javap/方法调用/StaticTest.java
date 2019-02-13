package com.github.bakerzhu.agent.example.javap.方法调用;

/**
 * @Description
 * @auther bozhu
 * invokestatic ：调用静态方法;
 */
public class StaticTest {
    public static void  hello() {
        System.out.println("hello");
/**
 Code:
 0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 3: ldc           #3                  // String hello
 5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
 8: return
 */
    }
    public static void main(String[] args) {
        StaticTest.hello();
    }
/**
public static void main(java.lang.String[]);
 Code:
 0: invokestatic  #5                  // Method hello:()V
 3: return
 */
}
