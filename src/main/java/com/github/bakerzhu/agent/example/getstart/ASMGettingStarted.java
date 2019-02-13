package com.github.bakerzhu.agent.example.getstart;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.V1_8;

/**
 * @Description
 * @auther bozhu
 * @create 01\ 29\ 2019
 */
public class ASMGettingStarted {

    static ClassWriter createClassWriter(String className) {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cw.visit(V1_8, ACC_PUBLIC,className,null,"java/lang/Object",null);
        MethodVisitor mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
        // mv.visitInsn();
        return null;
    }
}
