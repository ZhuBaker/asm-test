package com.github.bakerzhu.agent.example.javap.类型变换;

/**
 * @Description
 * @auther bozhu
 *
指令码               助记符                                           说明
0x85                 i2l                     将栈顶int型数值强制转换成long型数值并将结果压入栈顶
0x86                 i2f                     将栈顶int型数值强制转换成float型数值并将结果压入栈顶
0x87                 i2d                     将栈顶int型数值强制转换成double型数值并将结果压入栈顶
0x88                 l2i                     将栈顶long型数值强制转换成int型数值并将结果压入栈顶
0x89                 l2f                     将栈顶long型数值强制转换成float型数值并将结果压入栈顶
0x8a                 l2d                     将栈顶long型数值强制转换成double型数值并将结果压入栈顶
0x8b                 f2i                     将栈顶float型数值强制转换成int型数值并将结果压入栈顶
0x8c                 f2l                     将栈顶float型数值强制转换成long型数值并将结果压入栈顶
0x8d                 f2d                     将栈顶float型数值强制转换成double型数值并将结果压入栈顶
0x8e                 d2i                     将栈顶double型数值强制转换成int型数值并将结果压入栈顶
0x8f                 d2l                     将栈顶double型数值强制转换成long型数值并将结果压入栈顶
0x90                 d2f                     将栈顶double型数值强制转换成float型数值并将结果压入栈顶
0x91                 i2b                     将栈顶int型数值强制转换成byte型数值并将结果压入栈顶
0x92                 i2c                     将栈顶int型数值强制转换成char型数值并将结果压入栈顶
0x93                 i2s                     将栈顶int型数值强制转换成short型数值并将结果压入栈顶
这些指令从栈中弹出一个值，将其转换为另一类型，并将结果压入栈中。它们对
应于 Java 中的类型转换表达式。I2F, F2D, L2D 等将数值由一种数值类型转换为另一种
类型。 CHECKCAST t 将一个引用值转换为类型 t 。

CHECKCAST指令实际上和INSTANCEOF指令是很像的，不同的是CHECKCAST如果失败，会抛出一个异常，INSTANCEOF是返回一个值。
 */
public class TypeCast {
    public int convert(String str) {
        long l = 100L;
        return (int)l;
    }
    /**
    public int convert(java.lang.String);
     Code:
     0: ldc2_w        #2                  // long 100l   {@link com.github.bakerzhu.agent.example.javap.常量.Ldc  }
     3: lstore_2    从栈中取出long类型(两个字节) 放入局部连量表下标为 2 的地址中
     4: lload_2     将下标为2的局部变量表中数据 压入操作数栈中
     5: l2i         取出栈顶long元素 转换为int值 并压入栈
     6: ireturn     将栈中int值取出并返回
     */
}
