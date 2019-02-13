package com.github.bakerzhu.agent.example.removefield;

import org.objectweb.asm.*;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @Description
 * @auther bozhu
 */
public class AddField extends ClassVisitor {

    String fieldName = "thisIsNewField1";
    private int acc = Opcodes.ACC_PUBLIC;
    boolean isPresent = false;

    public AddField(ClassVisitor cv) {
        super(Opcodes.ASM5, cv);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        if(name.equals(fieldName)) {
            this.isPresent = true;
        }
        return super.visitField(access, name, desc, signature, value);
    }


    @Override
    public void visitEnd() {
        if(!isPresent) {
            FieldVisitor fv = this.cv.visitField(acc, fieldName, "I", null, 3);
            if(fv != null) {
                fv.visitEnd();
            }
        }
        super.visitEnd();
    }


    public static void main(String[] args) throws Exception{
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        AddField af = new AddField(cw);
        ClassReader cr = new ClassReader("com.github.bakerzhu.agent.example.removefield.Student");
        cr.accept(af,0);

        File file=new File("target/classes/com/github/bakerzhu/agent/example/removefield/StudentNew.class");
        String parent=file.getParent();
        File parent1=new File(parent);
        parent1.mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write(cw.toByteArray());

    }
}
