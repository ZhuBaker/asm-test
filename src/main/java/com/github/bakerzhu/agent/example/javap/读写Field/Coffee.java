package com.github.bakerzhu.agent.example.javap.读写Field;

/**
 * @Description
 *
 * 读写Fields：GETFIELD，PUTFIELD。对于static属性的操作有：GETSTATIC ，PUTSTATIC
 */
public class Coffee {

    int bean ;

/** 构造函数
public com.github.bakerzhu.agent.example.javap.读写Field.Coffee();
     Code:
     0: aload_0
     1: invokespecial #1                  // Method java/lang/Object."<init>":()V
     4: return
 */

    public int getBean() {
        return bean;
/**
public int getBean();
 Code:
 0: aload_0             // this入栈
 1: getfield      #2    // Field bean:I  将栈顶元素取出 并获取field 将field属性取出并入栈
 4: ireturn             // 返还栈顶元素
 */
    }

    public void setBean(int bean) {
        this.bean = bean;
/**
public void setBean(int);
 Code:
 0: aload_0             // 将this入栈
 1: iload_1             // 将第一个参数入栈
 2: putfield      #2    // Field bean:I  弹出两个参数 将栈顶元素赋予 第二个元素的#2field值
 5: return
 */
    }
}
