package com.github.bakerzhu.agent.example.removefield;

import org.objectweb.asm.*;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @Description
 * @auther bozhu
 */
public class RemoveMethod extends ClassVisitor{

    public RemoveMethod(ClassVisitor cv) {
        super(Opcodes.ASM5, cv);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, "com/github/bakerzhu/agent/example/removefield/Cwtest", signature, superName, interfaces);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        if(name.startsWith("do")) {
            return null;
        }
        return super.visitMethod(access, name, desc, signature, exceptions);
    }

    public static void main(String[] args) throws Exception{
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        RemoveMethod rm = new RemoveMethod(cw);
        ClassReader cr = new ClassReader("com.github.bakerzhu.agent.example.removefield.Student");
        cr.accept(rm,0);

        File file=new File("target/classes/com/github/bakerzhu/agent/example/removefield/Cwtest.class");
        String parent=file.getParent();
        File parent1=new File(parent);
        parent1.mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write(cw.toByteArray());

    }
}
