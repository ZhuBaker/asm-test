package com.github.bakerzhu.agent.example.javap.字段;

/**
 * 下面这两种情况，该对象都必须是 owner 类型，它的字段必须为 desc 类型。 GETSTATIC 和 PUTSTATIC 是类似指令，但用于静态字段。
 */
public class GsField {
    private int field;
/** 类还有一个默认的公有构造器，由于程序员没有定义显式的构造器，所以它是由编译器生成的。这个默认的公有构造器被生成为 Bean() { super(); }。这个构造器的字节代码
 如下：
 Code:
 0: aload_0
 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 4: return
 */
    public int getField() {
        return this.field;
/**  GETFIELD owner name desc 弹出一个对象引用，并压和其 name 字段中的值。
 Code:
 0: aload_0
 1: getfield      #2                  // Field field:I
 4: ireturn
 */
    }
    public void setField(int field) {
        this.field = field;
    }
/**  PUTFIELD owner name desc 弹出一个值和一个对象引用，并将这个值存储在它的 name 字段中。
 Code:
 0: aload_0
 1: iload_1
 2: putfield      #2                  // Field field:I
 5: return
 */
}
