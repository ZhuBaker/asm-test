package com.github.bakerzhu.agent.instrument;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

/**
 * @Description
 * @auther bozhu
 * @create 12\ 24\ 2018
 */
public class PreMain {
    public static void premain(String agentArgs, Instrumentation inst)  throws ClassNotFoundException,UnmodifiableClassException
    {
        inst.addTransformer(new Tramsformer());
    }
}
