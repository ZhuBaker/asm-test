package com.github.bakerzhu.agent.asm.day01;

import org.objectweb.asm.ClassWriter;

import static org.objectweb.asm.Opcodes.*;
import static org.objectweb.asm.Opcodes.ACC_ABSTRACT;
import static org.objectweb.asm.Opcodes.ACC_PUBLIC;

/**
 * @Description
 * @auther bozhu
 */
public class MyClassLoader extends ClassLoader {

    public Class defineClass(String name , byte[] b) {
        return defineClass(name,b,0,b.length);
    }

    public static void main(String[] args) {
        MyClassLoader classLoader = new MyClassLoader();

        ClassWriter cw = new ClassWriter(0);
        cw.visit(V1_5,ACC_PUBLIC + ACC_ABSTRACT + ACC_INTERFACE , "pkg/Comparable",
                null,"java/lang/Object",new String[]{"com/github/bakerzhu/agent/asm/day01/Mesurable"});
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC ,
                "LESS" ,"I" , null,new Integer(-1)).visitEnd();
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC ,
                "EQUAL","I",null , new Integer(0)).visitEnd();
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC ,
                "GREATER","I",null , new Integer(1)).visitEnd();
        cw.visitMethod(ACC_PUBLIC + ACC_ABSTRACT  ,"compareTo" ,
                "(Ljava/lang/Object)I",null,null).visitEnd();
        cw.visitEnd();
        byte[] bytes = cw.toByteArray();


        Class aClass = classLoader.defineClass("pkg.Comparable", bytes);
        System.out.println(aClass);
    }

}
