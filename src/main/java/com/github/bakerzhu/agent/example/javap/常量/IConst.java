package com.github.bakerzhu.agent.example.javap.常量;

/**
 * @Description
 * @auther bozhu
 *
    这些指令在操作数栈压入一个常量值： ACONST_NULL 压入 null， ICONST_0 压入
    int 值 0， FCONST_0 压入 0f， DCONST_0 压入 0d， BIPUSH b 压入字节值 b， SIPUSH
    s 压入 short 值 s， LDC cst 压入任意 int、float、long、double、String 或 class①
    常量 cst，等等。
 *
 * 当int取值-1~5采用iconst指令，取值-128~127采用bipush指令，
 * 取值-32768~32767采用sipush指令，取值-2147483648~2147483647采用 ldc 指令 进行压栈处理。
 *
 *
指令码    助记符                               说明
0x12            ldc                 将int, float或String型常量值从常量池中推送至栈顶
0x13            ldc_w               将int, float或String型常量值从常量池中推送至栈顶（宽索引）
0x14            ldc2_w              将long或double型常量值从常量池中推送至栈顶（宽索引）
 * 当int取值-1~5时，JVM采用iconst指令将常量压入栈中。
 */
public class IConst {
    public static void main(String[] args) {
        int i = 5;
        int j = -1;
    }
/**
 public static void main(java.lang.String[]);
 Code:
 0: iconst_5
 1: istore_1
 2: iconst_m1
 3: istore_2
 4: return
 */
}
