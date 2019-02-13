package com.github.bakerzhu.agent.asm.chap02.generateclass;

import org.objectweb.asm.ClassWriter;

/**
 * @Description
 * @auther bozhu
 */
public class StubClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if (name.endsWith("_Stub")) {
            ClassWriter cw = new ClassWriter(0);
            byte[] bytes = cw.toByteArray();
            return defineClass(name, bytes, 0, bytes.length);
        }
        return super.findClass(name);
    }
}
