package com.github.bakerzhu.agent.example.removefield;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.util.CheckClassAdapter;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.PrintWriter;

import static org.objectweb.asm.Opcodes.*;

/**
 * @Description
 * @auther bozhu
 * TraceClassVisitor用来查看生成的字节码对应的类是否是想要的类
 *
 * CheckClassAdapter这类是用来检查它的方法调用以及参数是否正确
 */
public class ViewClass {

    public static void main(String[] args) {
        ClassWriter cw = new ClassWriter(3);
        CheckClassAdapter cca = new CheckClassAdapter(cw);
        TraceClassVisitor tv = new TraceClassVisitor(cca ,new PrintWriter(System.out));
        tv.visit(V1_8,ACC_PUBLIC+ACC_ABSTRACT+ACC_INTERFACE,
                "org/by/Cwtest",null,"java/lang/Object",
                null);
        tv.visitField(ACC_PUBLIC+ACC_STATIC+ACC_FINAL,"LESS","I",
                null,new Integer(-1)).visitEnd();
        tv.visitField(ACC_PUBLIC+ACC_STATIC+ACC_FINAL,"EQUAL","I",
                null,new Integer(0)).visitEnd();
        tv.visitField(ACC_PUBLIC+ACC_STATIC+ACC_FINAL,"GRATER","I",
                null,new Integer(1)).visitEnd();

        tv.visitMethod(ACC_PUBLIC+ACC_ABSTRACT,"compareTo","(Ljava/lang/Object;)I",
                null,null).visitEnd();
        tv.visitEnd();

    }
}
