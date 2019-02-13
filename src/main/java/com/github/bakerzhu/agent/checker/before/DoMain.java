package com.github.bakerzhu.agent.checker.before;

import com.github.bakerzhu.agent.checker.Account;
import com.github.bakerzhu.agent.checker.AccountImpl;

import java.lang.reflect.Proxy;

/**
 * @Description
 * @auther bozhu
 */
public class DoMain {

    public static void main(String[] args) {
        Account account = (Account) Proxy.newProxyInstance(Account.class.getClassLoader(),
                new Class[]{Account.class},new SecurityProxyInvocationHandler(new AccountImpl()));
        account.operation();
    }
}
