package com.leetcode.Easy;

// 1108. Defanging an IP Address
public class DefangingAnIPAddress {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
