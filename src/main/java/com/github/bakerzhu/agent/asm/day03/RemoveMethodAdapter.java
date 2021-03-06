package com.github.bakerzhu.agent.asm.day03;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.ASM4;

/**
 * @Description
 * @auther bozhu
 */
public class RemoveMethodAdapter extends ClassVisitor{

    private String mName;
    private String mDesc;

    public RemoveMethodAdapter(ClassVisitor cv , String mName , String mDesc) {
        super(ASM4, cv);
        this.mName = mName;
        this.mDesc = mDesc;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc,
                                     String signature, String[] exceptions) {
        if(name.equals(mName) && desc.equals(mDesc)) {
            return null;
        }
        return super.visitMethod(access, name, desc, signature, exceptions);
    }
}
