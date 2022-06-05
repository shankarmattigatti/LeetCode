package com.leetcode.Easy;

// 1935. Maximum Number of Words You Can Type
public class MaximumNumberOfWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] str = text.split(" ");
        for (String st : str) {
            boolean bw = false;
            for (char ch : brokenLetters.toCharArray()) {
                if (st.indexOf(ch) != -1) {
                    bw = true;
                    break;
                }
            }
            if (!bw)
                count++;
        }
        return count;
    }
}
