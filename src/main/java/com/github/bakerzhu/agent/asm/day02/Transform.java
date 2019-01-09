package com.github.bakerzhu.agent.asm.day02;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import static org.objectweb.asm.Opcodes.ASM4;

/**
 * @Description
 * @auther bozhu
 */
public class Transform {

    public static void main(String[] args) {

    }


    private static void test1(){
        byte[] b1 = null;
        ClassWriter cw = new ClassWriter(0);
        ClassReader cr = new ClassReader(b1);
        cr.accept(cw , 0);
        cw.toByteArray();
    }

    private static void test2() {
        byte[] b1 = null;
        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv = new ClassVisitor(ASM4,cw) {
        };
        ClassReader cr = new ClassReader(b1);
        cr.accept(cv,0);
        byte[] b2 = cw.toByteArray();  // b1 与 b2 表示同一个类
    }


    private static void test3() {
        byte[] b1 = null;
        ClassReader cr = new ClassReader(b1);
        ClassWriter cw = new ClassWriter(cr,0);
        ClassVisiterAdapter ca = new ClassVisiterAdapter(cw);
        cr.accept(ca,0);

        byte[] bytes = cw.toByteArray();
    }
}
