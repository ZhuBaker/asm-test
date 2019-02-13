package com.github.bakerzhu.agent.example.javap.方法调用;

/**
 * @Description
 * @auther bozhu
 */
public class SpecialTest {
    private int id;
    public void execute() {
        System.out.println("execute");
    }
    public static void main(String[] args) {
        SpecialTest test = new SpecialTest();
        test.execute();
    }
/**
public static void main(java.lang.String[]);
 Code:
 0: new            #2   创建对象并将引用压栈  // class com/github/bakerzhu/agent/example/javap/▒▒▒▒▒▒▒▒/VirtualTest
 3: dup                 重新压入栈顶的副本
 4: invokespecial  #3   从栈顶取出地址引用并执行构造方法 // Method "<init>":()V
 7: astore_1            从栈顶取出地址引用并将引用地址存入 局部变量表中
 8: aload_1             将局部变量表第一个元素压入栈中
 9: invokevirtual #7    调用栈顶元素的 execute 方法              // Method execute:()V
 12: return
 */
}
