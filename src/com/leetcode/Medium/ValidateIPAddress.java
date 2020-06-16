package com.leetcode.Medium;

// 468. Validate IP Address
public class ValidateIPAddress {
    public String validIPAddress(String IP) {
        if (IP == null || IP.length() == 0)
            return "Neither";
        if (validIPv4Address(IP))
            return "IPv4";
        if (validIPv6Address(IP))
            return "IPv6";

        return "Neither";
    }

    private boolean validIPv4Address(String IP) {
        if (IP.charAt(IP.length() - 1) == '.')
            return false;

        String[] numbers = IP.split("\\.");
        if (numbers.length != 4)
            return false;

        for (String str : numbers) {
            if (str.length() == 0 || str.length() > 3)
                return false;
            if (str.length() > 1 && str.charAt(0) == '0')
                return false;

            int val = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch < '0' || ch > '9')
                    return false;

                val = val * 10 + (ch - '0');
            }
            if (val < 0 || val > 255)
                return false;
        }
        return true;
    }

    private boolean validIPv6Address(String IP) {
        if (IP.charAt(IP.length() - 1) == ':')
            return false;

        String[] numbers = IP.split(":");
        if (numbers.length != 8)
            return false;

        for (String str : numbers) {
            if (str.length() == 0 || str.length() > 4)
                return false;

            int i = 0;
            while (i < str.length()) {
                char ch = str.charAt(i++);
                if ((ch < '0' || ch > '9') && (ch < 'a' || ch > 'f') && (ch < 'A' || ch > 'F'))
                    return false;
            }
        }
        return true;
    }
}
