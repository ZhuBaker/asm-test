package com.github.bakerzhu.agent.checker.before;

import com.github.bakerzhu.agent.checker.Account;
import com.github.bakerzhu.agent.checker.SecurityChecker;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description
 * @auther bozhu
 */
public class SecurityProxyInvocationHandler implements InvocationHandler{

    private Object proxyedObject;
    public SecurityProxyInvocationHandler(Object o) {
        proxyedObject = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(proxy instanceof Account && method.getName().equals("operation")) {
            SecurityChecker.checkSecurity();
        }
        return method.invoke(proxyedObject,args);
    }
}
