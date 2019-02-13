package com.github.bakerzhu.agent.example.javap.数组操作;

/**
 * @Description
 * @auther bozhu
指令码    助记符                                          说明
0x2e        iaload                                  将int型数组指定索引的值推送至栈顶
0x2f        laload                                  将long型数组指定索引的值推送至栈顶
0x30        faload                                  将float型数组指定索引的值推送至栈顶
0x31        daload                                  将double型数组指定索引的值推送至栈顶
0x32        aaload   栈中弹出两个值(下标和数组本身) 将引用型数组指定索引的值推送至栈顶
0x33        baload                                  将boolean或byte型数组指定索引的值推送至栈顶
0x34        caload                                  将char型数组指定索引的值推送至栈顶
0x35        saload                                  将short型数组指定索引的值推送至栈顶

指令码    助记符                                                      说明
0x4f        iastore                                             将栈顶int型数值存入指定数组的指定索引位置
0x50        lastore                                             将栈顶long型数值存入指定数组的指定索引位置
0x51        fastore                                             将栈顶float型数值存入指定数组的指定索引位置
0x52        dastore                                             将栈顶double型数值存入指定数组的指定索引位置
0x53        aastore   栈中弹出三个值(依次是存储值,下标,索引)    将栈顶引用型数值存入指定数组的指定索引位置
0x54        bastore                                             将栈顶boolean或byte型数值存入指定数组的指定索引位置
0x55        castore                                             将栈顶char型数值存入指定数组的指定索引位置
0x56        sastore                                             将栈顶short型数值存入指定数组的指定索引位置

*/
public class ArrayOperate {

    final String names[]={"robin","hb"};

    /**
public com.github.bakerzhu.agent.example.javap.数组操作.ArrayOperate();
     Code:
     0: aload_0
     1: invokespecial #1    // Method java/lang/Object."<init>":()V

     4: aload_0             //将局部变量表中第一个(this) 元素压入栈顶
     5: iconst_2            //将2压入栈顶
     6: anewarray     #2    // class java/lang/String  创建String 引用类型数组 大小为2 并入栈
     9: dup                 // 将数组复制并压入栈
     10: iconst_0           // 将0入栈
     11: ldc           #3   // String robin 将 robin 入栈
     13: aastore            // aastore  将栈顶引用型数值存入指定数组的指定索引位置
     14: dup                // 将数组复制并压入栈
     15: iconst_1           // 将1入栈
     16: ldc           #4   // String hb  将hb 入栈
     18: aastore            // aastore  将栈顶引用型数值存入指定数组的指定索引位置
     19: putfield      #5   // Field names:[Ljava/lang/String;  为 this 的 names 设置引用类型值
     22: return
     */

    public void javapGetArray() {
        String str=names[0];
/**
 public void javapGetArray();
     Code:
     0: aload_0             //将this引用推送至栈顶，即压入栈。
     1: getfield   #5       // Field names:[Ljava/lang/String;  将栈顶的指定的对象的第5个实例域（Field）的值（这个值可能是引用，这里就是引用）压入栈顶
     4: iconst_0            //数组的索引值（下标）推至栈顶，即压入栈
     5: aaload              //根据栈里内容来把name数组的第一项的值推至栈顶  栈中弹出两个值（索引和下标）
     6: astore_1            //把栈顶的值存到str变量里。因为str在我的程序中是其所在非静态函数的第2个变量(从0开始计数)，
     7: return
 */
    }

    public void javapSetArray() {
        int moneys[]=new int[5];
        moneys[1]=100;

/**
public void javapSetArray();
 Code:
 0: iconst_5            // 将5压栈
 1: newarray       int  // 创建新int类型数组 从栈顶弹出初始大小 并将数组引用压入栈顶
 3: astore_1            // 将栈顶引用型数值 存入指定本地变量表
 4: aload_1             // 将局部变量表中数值 存入栈顶（数组）
 5: iconst_1            // 将1压入栈顶
 6: bipush        100   // 当int取值-128~127时，JVM采用bipush指令将常量压入栈中。
 8: iastore             // iastore  将栈顶int型数值存入指定数组的指定索引位置
 9: return
*/
    }
}
