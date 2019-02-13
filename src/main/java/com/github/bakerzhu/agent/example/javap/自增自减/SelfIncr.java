package com.github.bakerzhu.agent.example.javap.自增自减;

/**
 * @Description

指令码         助记符                                            说明
0x84                  iinc                将指定int型变量增加指定值（i++, i--, i+=2）
该指令用于对本地(局部)变量进行自增减操作。
该指令第一参数为本地变量的编号，第二个参数为自增减的数量。


 */
public class SelfIncr {

    public void incr() {
        int d = 10;
        d++;
        d += 2;
        d--;
/**
 *
public void incr();
 Code:
 0: bipush        10
 2: istore_1                //在我的程序中是其所在非静态函数的第1个变量(从0开始计数).
 3: iinc          1, 1
 6: iinc          1, 2
 9: iinc          1, -1
 12: return
 */
    }

}
