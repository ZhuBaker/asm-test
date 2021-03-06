package com.github.bakerzhu.agent.asm.day03;

import org.objectweb.asm.ClassVisitor;

import static org.objectweb.asm.Opcodes.ASM4;

/**
 * @Description
 * @auther bozhu
 */
public class MultiClassAdapter extends ClassVisitor{

    protected ClassVisitor[] cvs;

    public MultiClassAdapter(ClassVisitor[] cvs) {
        super(ASM4);
        this.cvs = cvs;
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        for (ClassVisitor cv : cvs) {
            cv.visit(version, access, name, signature, superName, interfaces);
        }
    }
}
