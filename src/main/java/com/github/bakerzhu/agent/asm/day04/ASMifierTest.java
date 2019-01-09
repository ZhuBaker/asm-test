package com.github.bakerzhu.agent.asm.day04;

import org.objectweb.asm.util.ASMifier;

/**
 * @Description
 * @auther bozhu
 * @create 12\ 18\ 2018
 */
public class ASMifierTest {

    public static void main(String[] args) throws Exception{
        ASMifier.main(new String[]{"java.lang.Runnable"});
    }
}
