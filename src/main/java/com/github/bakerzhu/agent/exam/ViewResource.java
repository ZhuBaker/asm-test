package com.github.bakerzhu.agent.exam;

import org.objectweb.asm.util.ASMifier;

/**
 * @Description
 * @auther bozhu
 */
public class ViewResource {

    public static void main(String[] args) throws Exception{
        ASMifier.main(new String[]{"com.github.bakerzhu.agent.example.removefield.Student"});
    }
}
