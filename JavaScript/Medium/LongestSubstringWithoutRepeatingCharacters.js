// 3. Longest Substring Without Repeating Characters

/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let j = 0, maxLength = 0;
    let map = new Map();
    for (let i = 0; i < s.length; i++) {
        let ch = s[i];
        if (map.has(ch))
            j = Math.max(j, map.get(ch) + 1);

        map.set(ch, i);
        maxLength = Math.max(maxLength, i - j + 1);
    }
    
    return maxLength;
};