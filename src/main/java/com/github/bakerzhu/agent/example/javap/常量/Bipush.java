package com.github.bakerzhu.agent.example.javap.常量;

/**
 * @Description
 * @auther bozhu
 *
 *   当int取值-128~127时，JVM采用bipush指令将常量压入栈中。
 */
public class Bipush {
    public static void main(String[] args) {
        int i = 127;
    }
/**
 public static void main(java.lang.String[]);
 Code:
 0: bipush        127
 2: istore_1
 3: return
 */
// nt取值0~5时JVM采用iconst_0、iconst_1、iconst_2、iconst_3、iconst_4、iconst_5
// 指令将常量压入栈中，取值-1时采用iconst_m1指令将常量压入栈中

}
