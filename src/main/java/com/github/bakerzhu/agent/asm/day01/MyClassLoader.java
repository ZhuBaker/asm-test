package com.github.bakerzhu.agent.asm.day01;

/**
 * @Description
 * @auther bozhu
 */
public class MyClassLoader extends ClassLoader {

    public Class defineClass(String name , byte[] b) {
        return defineClass(name,b,0,b.length);
    }

}
