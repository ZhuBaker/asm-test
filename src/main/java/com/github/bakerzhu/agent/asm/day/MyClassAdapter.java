package com.github.bakerzhu.agent.asm.day;


import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.ASM4;

/**
 * @Description
 * @auther bozhu
 */
public class MyClassAdapter extends ClassVisitor {

    public MyClassAdapter(int api, ClassVisitor cv) {
        super(ASM4, cv);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        MethodVisitor methodVisitor = super.visitMethod(access, name, desc, signature, exceptions);
        if(name.equals("init")) {

        }
        return null;

    }
}
