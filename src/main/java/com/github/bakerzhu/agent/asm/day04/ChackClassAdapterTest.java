package com.github.bakerzhu.agent.asm.day04;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.util.CheckClassAdapter;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.PrintWriter;

/**
 * @Description
 * @auther bozhu
 */
public class ChackClassAdapterTest {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        ClassWriter cw = new ClassWriter(0);
        TraceClassVisitor tcv = new TraceClassVisitor(cw,pw);
        CheckClassAdapter cca = new CheckClassAdapter(tcv);

    }
}
