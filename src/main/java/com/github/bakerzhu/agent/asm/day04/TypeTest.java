package com.github.bakerzhu.agent.asm.day04;

import org.objectweb.asm.Type;

/**
 * @Description
 * @auther bozhu
 */
public class TypeTest {

    public static void main(String[] args) {
        String internalName = Type.getType(Integer.class).getInternalName();
        System.out.println(internalName);
        String descriptor = Type.getType(Integer.class).getDescriptor();
        System.out.println(descriptor);
        String d = Type.INT_TYPE.getDescriptor();
        System.out.println(d);

        Type[] argumentTypes = Type.getArgumentTypes("(I)V");
        Type returnType = Type.getReturnType("(I)V");


    }
}
