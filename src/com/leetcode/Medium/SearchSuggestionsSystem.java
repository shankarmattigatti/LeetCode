package com.leetcode.Medium;

import java.util.*;

// 1268. Search Suggestions System
public class SearchSuggestionsSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        List<String> words = new ArrayList<>();
        for(String product : products)
            words.add(product.toLowerCase());

        Collections.sort(words);
        for(int i = 1; i <= searchWord.length(); i++) {
            String str = searchWord.substring(0, i);
            List<String> ls = new ArrayList<>();
            for(int j = 0; j < words.size() && ls.size() < 3; j++) {
                if(words.get(j).startsWith(str)) {
                    ls.add(words.get(j));
                }
            }
            res.add(ls);
        }
        return res;
    }
}
