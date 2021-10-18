package com.leetcode.Medium;

// 2043. Simple Bank System
public class SimpleBankSystem {
    private final long[] accounts;

    public SimpleBankSystem(long[] balance) {
        this.accounts = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 - 1 > accounts.length || account2 - 1 > accounts.length)
            return false;

        if (money > accounts[account1 - 1])
            return false;

        accounts[account1 - 1] -= money;
        accounts[account2 - 1] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (account - 1 > accounts.length)
            return false;

        accounts[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account - 1 > accounts.length)
            return false;

        if (money > accounts[account - 1])
            return false;

        accounts[account - 1] -= money;
        return true;
    }
}
