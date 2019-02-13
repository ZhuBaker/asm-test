package com.github.bakerzhu.agent.example.javap.比较指令;

/**
 * @Description

指令码         助记符                                           说明
0x94            lcmp                比较栈顶两long型数值大小，并将结果（1，0，-1）压入栈顶
0x95            fcmpl               比较栈顶两float型数值大小，并将结果（1，0，-1）压入栈顶；当其中一个数值为NaN时，将-1压入栈顶
0x96            fcmpg               比较栈顶两float型数值大小，并将结果（1，0，-1）压入栈顶；当其中一个数值为NaN时，将1压入栈顶
0x97            dcmpl               比较栈顶两double型数值大小，并将结果（1，0，-1）压入栈顶；当其中一个数值为NaN时，将-1压入栈顶
0x98            dcmpg               比较栈顶两double型数值大小，并将结果（1，0，-1）压入栈顶；当其中一个数值为NaN时，将1压入栈顶
 */
public class CompareOperate {

    public void longTest() {
        long a=11;
        long b=10;
        boolean result=(a>b);
/**
public void longTest();
 Code:
 0: ldc2_w        #2                  // long 11l
 3: lstore_1
 4: ldc2_w        #4                  // long 10l
 7: lstore_3
 8: lload_1
 9: lload_3
 10: lcmp                           // 比较栈顶两long型数值大小，并将结果（1，0，-1）压入栈顶
 11: ifle          18               //  ifle     栈顶弹出一个值 当栈顶int型数值小于等于0时跳转 (if lower and equal)
 14: iconst_1
 15: goto          19               // 无条件跳转
 18: iconst_0
 19: istore        5
 21: return
 */
    }

    public void test() {
        int a=11;
        int b=10;
        boolean result=(a>b);
/**
 public void test();
 Code:
 0: bipush        11
 2: istore_1
 3: bipush        10
 5: istore_2
 6: iload_1
 7: iload_2
 8: if_icmple     15
 11: iconst_1
 12: goto          16
 15: iconst_0
 16: istore_3
 17: return
 */
    }

}
