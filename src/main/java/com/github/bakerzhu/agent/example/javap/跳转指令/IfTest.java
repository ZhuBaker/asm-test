package com.github.bakerzhu.agent.example.javap.跳转指令;

/**
 * @Description
 * @auther bozhu
 *
有条件跳转指令系列A
指令码         助记符                                           说明
0x99                ifeq                              当栈顶int型数值等于0时跳转
0x9a                ifne                              当栈顶int型数值不等于0时跳转
0x9b                iflt                              当栈顶int型数值小于0时跳转
0x9c                ifge                              当栈顶int型数值大于等于0时跳转
0x9d                ifgt        当栈顶int型数值大于0时跳转
0x9e                ifle        当栈顶int型数值小于等于0时跳转
0x9f               if_icmpeq    比较栈顶两int型数值大小，当结果等于0时跳转
0xa0               if_icmpne    比较栈顶两int型数值大小，当结果不等于0时跳转
0xa1               if_icmplt    比较栈顶两int型数值大小，当结果小于0时跳转
0xa2               if_icmpge    比较栈顶两int型数值大小，当结果大于等于0时跳转
0xa3               if_icmpgt    比较栈顶两int型数值大小，当结果大于0时跳转
0xa4               if_icmple    比较栈顶两int型数值大小，当结果小于等于0时跳转
0xa5               if_acmpeq    比较栈顶两引用型数值，当结果相等时跳转
0xa6               if_acmpne    比较栈顶两引用型数值，当结果不相等时跳转

无条件跳转指令系列A
指令码         助记符                                           说明
0xa7                goto                                           无条件跳转
0xa8                jsr                   跳转至指定16位offset位置，并将jsr下一条指令地址压入栈顶
0xa9                ret                   返回至本地变量指定的index的指令位置（一般与jsr, jsr_w联合使用）
0xaa              tableswitch         用于switch条件跳转，case值连续（可变长度指令）
0xab              lookupswitch        用于switch条件跳转，case值不连续（可变长度指令）


 */
public class IfTest {
    public void test() {
        int a = 11;
        int b = 10;
        boolean result = (a > b);
        if (result) {
            a += 2;
        }
        if (!result) {
            a += 2;
        }
        if (a > 0) {
            a--;
        }
    }
    /**
     * Code:
     * 0: bipush     11     在操作数栈中压入11
     * 2: istore_1          将操作数栈头11 弹出存入局部变量表1
     * 3: bipush     10     在操作数栈中压入10
     * 5: istore_2          将操作数栈头10 弹出存入局部变量表2
     * 6: iload_1           将11 压入栈头
     * 7: iload_2           将10 压入栈头
     * 8: if_icmple  15    if_icmple会比较栈顶的两个值的大小。如果intOne小于或者等于intTwo的话会跳转到第15行处的字节码来执行
     * 11: iconst_1         将 1 压入栈顶
     * 12: goto      16
     * 15: iconst_0         将 0 压入栈顶
     * 16: istore_3         将栈顶元素弹出存入局部变量表3  ---- result
     * 17: iload_3          将局部变量表3 存入栈顶
     * 18: ifeq     24      如果结果为 0 时(即为false)，就跳转到第24个指令继续执行
     * 21: iinc     1, 2    将局部变量表下标为1的元素加 2
     * 24: iload_3          将 0 压如栈中
     * 25: ifne     31      如果结果不为 0 时(即为true)，就跳转到第31个指令继续执行
     * 28: iinc     1, 2    将局部变量表下标为1的元素加 2
     * 31: iload_1
     * 32: ifle     38
     * 35: iinc     1, -1
     * 38: return
     */

    public static void main(String[] args) {
        new IfTest().test();
    }
}
