package com.leetcode.Easy;

// 1880. Check if Word Equals Summation of Two Words
public class CheckIfWordEqualsSummationOfTwoWords {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder firstInt = new StringBuilder();
        StringBuilder secondInt = new StringBuilder();
        StringBuilder targetInt = new StringBuilder();
        for (char ch : firstWord.toCharArray())
            firstInt.append(Character.getNumericValue(ch) - 10);

        for (char ch : secondWord.toCharArray())
            secondInt.append(Character.getNumericValue(ch) - 10);

        for (char ch : targetWord.toCharArray())
            targetInt.append(Character.getNumericValue(ch) - 10);

        int sum = Integer.parseInt(firstInt.toString()) + Integer.parseInt(secondInt.toString());
        return sum == Integer.parseInt(targetInt.toString());
    }
}
