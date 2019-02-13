package com.github.bakerzhu.agent.asm.chap02;


import org.objectweb.asm.ClassReader;

import java.io.IOException;

/**
 * @Description
 * @auther bozhu
 */
public class DoMain {
    public static void main(String[] args) throws IOException {
        ClassPrinter cp = new ClassPrinter();
        ClassReader cr = new ClassReader("java.lang.Runnable");
        cr.accept(cp, 0);
    }
}
