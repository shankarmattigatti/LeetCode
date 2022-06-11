// 3. Longest Substring Without Repeating Characters

function lengthOfLongestSubstring(s: string): number {
    let j: number = 0;
    let maxLength: number = 0;
    const map: Map<string, number> = new Map();
    for (let i = 0; i < s.length; i++) {
        const encountered = map.get(s[i]);
        if (encountered != undefined) j = Math.max(j, encountered + 1);

        map.set(s[i], i);
        maxLength = Math.max(maxLength, i - j + 1);
    }

    return maxLength;
}
