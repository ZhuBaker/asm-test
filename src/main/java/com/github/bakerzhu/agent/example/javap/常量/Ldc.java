package com.github.bakerzhu.agent.example.javap.常量;

/**
 * @Description
 * @auther bozhu
 * 该系列命令负责把数值常量或String常量值从常量池中推送至栈顶。该命令后面需要给一个表示常量在常量池中位置(编号)的参数，
 *
 ldc  将int, float或String型常量值从常量池中推送至栈顶
 ldc_w  将int, float或String型常量值从常量池中推送至栈顶（宽索引）
 ldc2_w 将long或double型常量值从常量池中推送至栈顶（宽索引）
 */
public class Ldc {
    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
    }
/**
public static void main(java.lang.String[]);
 Code:
 0: ldc           #3                  // int 2147483647
 2: istore_1
 3: return
 */
// 可以看到上面代码第三行是采用ldc指令将2147483647常量压入栈中，
// 需要注意的是ldc指令是从常量池中获取值的，
// 也就是说在这段范围（-2147483648~2147483647）内的int值是存储在常量池中的。
}
