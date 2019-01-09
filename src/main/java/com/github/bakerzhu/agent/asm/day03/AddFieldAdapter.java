package com.github.bakerzhu.agent.asm.day03;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;

import static org.objectweb.asm.Opcodes.ASM4;

/**
 * @Description
 * @auther bozhu
 */
public class AddFieldAdapter extends ClassVisitor{
    private int fAcc;
    private String fName ;
    private String fDesc;
    private boolean isFieldPresent;
    public AddFieldAdapter(ClassVisitor cv,int fAcc , String fName , String fDesc) {
        super(ASM4, cv);
        this.fAcc = fAcc;
        this.fName = fName;
        this.fDesc = fDesc;
    }

    @Override
    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        if(name.equals(fName)) {
            isFieldPresent = true;
        }
        return super.visitField(access, name, desc, signature, value);
    }

    @Override
    public void visitEnd() {
        if(!isFieldPresent) {
            FieldVisitor fv = cv.visitField(fAcc, fName, fDesc, null, null);
            // 注意 visitEnd 方法中在调用fv.visitEnd()之前的 fv != null 检测：这是因为一个类访问器可以在 visitField 中返回 null，在上一节已经看到这一点 (RemoveMethodAdapter)
            if(fv != null) {
                fv.visitEnd();
            }
        }
        super.visitEnd();
    }
}
