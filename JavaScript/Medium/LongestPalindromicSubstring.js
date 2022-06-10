// 5. Longest Palindromic Substring

/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    if(s == null || s.length <= 1)
            return s;
        
    let res = s.substring(0, 1);
    for(let i = 0; i < s.length; i++) {
        let str1 = getLongestPalindrome(s, i, i);
        if(str1.length > res.length) {
            res = str1;
        }

        let str2 = getLongestPalindrome(s, i, i + 1);
        if(str2.length > res.length) {
            res = str2;
        }
    }
    return res;
};

    
var getLongestPalindrome = function(str, i, j) {
    while(i >= 0 && j <= str.length - 1 && str[i] == str[j]) {
        i--;
        j++;
    }
    return str.substring(i + 1, j);
}