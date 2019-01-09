package com.github.bakerzhu.agent.asm.day02;

import org.objectweb.asm.ClassVisitor;

import static org.objectweb.asm.Opcodes.ASM4;
import static org.objectweb.asm.Opcodes.V1_6;

/**
 * @Description
 * @auther bozhu
 */
public class ClassVisiterAdapter extends ClassVisitor {

    public ClassVisiterAdapter(ClassVisitor cv) {
        super(ASM4, cv);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(V1_6, access, name, signature, superName, interfaces);
    }
}
