package com.github.bakerzhu.agent.asm.chap02.generateclass;

import com.github.bakerzhu.agent.asm.chap02.ClassPrinter;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import static org.objectweb.asm.Opcodes.*;

/**
 * @Description
 * @auther bozhu
 */
public class DoMain {

    public static void main(String[] args) {
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
        ClassReader cr = new ClassReader(bytes);
        ClassPrinter cp = new ClassPrinter();
        cr.accept(cp,0);



    }
}
