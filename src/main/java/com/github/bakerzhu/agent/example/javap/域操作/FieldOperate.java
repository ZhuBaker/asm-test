package com.github.bakerzhu.agent.example.javap.域操作;

/**
 * @Description
指令码         助记符                                           说明
0xb2               getstatic                    获取指定类的静态域，并将其值压入栈顶
0xb3               putstatic                    用栈顶的值为指定的类的静态域赋值
0xb4               getfield                      获取指定类的实例域，并将其值压入栈顶
0xb5               putfield                       用栈顶的值为指定的类的实例域赋值
 */
public class FieldOperate {
    /**
 Code:
    0: aload_0
    1: invokespecial #1                  // Method java/lang/Object."<init>":()V
    4: aload_0
    5: lconst_0
    6: putfield      #2                  // Field m:J
    9: return
     */
    long m = 0;
    public void incr() {
        m++;
/**
 public void incr();
 Code:
 0: aload_0
 1: dup
 2: getfield      #2                  // Field m:J
 5: lconst_1
 6: ladd
 7: putfield      #2                  // Field m:J
 10: return
 */
    }
}
