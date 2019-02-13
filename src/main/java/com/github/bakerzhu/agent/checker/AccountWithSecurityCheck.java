package com.github.bakerzhu.agent.checker;

/**
 * @Description
 * @auther bozhu
 */
public class AccountWithSecurityCheck {
    private  Account account;
    public AccountWithSecurityCheck (Account account) {
        this.account = account;
    }
    public void operation() {
        SecurityChecker.checkSecurity();
        account.operation();
    }
}