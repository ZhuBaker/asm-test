package com.github.bakerzhu.agent.asm.day01;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.PrintWriter;

import static org.objectweb.asm.Opcodes.*;


/**
 * @Description
 * ClassVisitor方法调用必须要按照以下顺序：
 * visit visitSource? visitOuterClass? ( visitAnnotation | visitAttribute )* ( visitInnerClass | visitField | visitMethod )* visitEnd
 * @auther bozhu
 */
public class Main {

    public static void main(String[] args) {

        PrintWriter pw = new PrintWriter(System.out);
        ClassWriter cw = new ClassWriter(0);
        TraceClassVisitor cv = new TraceClassVisitor(cw,pw);
        cv.visit(V1_6,ACC_PUBLIC+ACC_ABSTRACT+ACC_INTERFACE,
                "com/github/bakerzhu/agent/asm/day01/Comparable",null,"java/lang/Object",
                new String[]{"com/github/bakerzhu/agent/asm/day01/Mesurable"});
        // V1_6—指明了类的版本Java 1.6
        cv.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL,
                "LESS", "I", null, new Integer(-1)).visitEnd();
        //由于此处 没 有 注 释 ， 所 以 立 即 调 用 所 返 回 的 FieldVisitor 的 visitEnd 方 法
        cv.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL ,
                "EQUAL" , "I", null , new Integer(0)).visitEnd();
        cv.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL ,
                "GREATER" , "I",null , new Integer(1)).visitEnd();
        cv.visitMethod(ACC_PUBLIC + ACC_ABSTRACT  ,
                "cmpareTo","(Ljava/lang/Object;)I",null,null).visitEnd();
        cv.visitEnd();
        byte[] bytes = cw.toByteArray();// 对 visitEnd 的最后一个调用是为了通知 cw：这个类已经结束

        /*MyClassLoader classLoader = new MyClassLoader();
        Class aClass = classLoader.defineClass("com.tujia.agent.asm.day01.Comparable", bytes);*/

    }
}
