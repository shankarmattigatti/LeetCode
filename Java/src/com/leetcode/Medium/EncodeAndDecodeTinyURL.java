package com.leetcode.Medium;

import java.util.*;

// 535. Encode and Decode TinyURL
public class EncodeAndDecodeTinyURL {
    private final Map<Integer, String> map = new HashMap();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int key = longUrl.hashCode();
        map.put(key, longUrl);
        return String.valueOf(key);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int key = Integer.parseInt(shortUrl);
        return map.get(key);
    }
}
