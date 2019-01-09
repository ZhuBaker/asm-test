package com.github.bakerzhu.agent.asm.day;


import org.objectweb.asm.ClassWriter;

import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.V1_6;

/**
 * @Description https://blog.csdn.net/u010039929/article/details/70058745
 * @auther bozhu
 */
public class GenerateClass {

    public void generateClass() {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(V1_6,ACC_PUBLIC , "com/github/bakerzhu/agent/asm/MyClass",
                null,"java/lang/Object",null);

    }



    public static void main(String[] args) {

    }
}
