// 5. Longest Palindromic Substring

function longestPalindrome(s: string): string {
    if(s == null || s.length <= 1)
            return s;
        
    let result = s.substring(0, 1);
    for(let i = 0; i < s.length; i++) {
        let str1:string = getLongestPalindrome(s, i, i);
        if(str1.length > result.length)
            result = str1;

        let str2:string = getLongestPalindrome(s, i, i + 1);
        if(str2.length > result.length) 
            result = str2;
    }

    return result;
}

function getLongestPalindrome(str:string, i: number, j: number): string {  
    while(i >= 0 && j <= str.length - 1 && str[i] == str[j]) {
        i--;
        j++;
    }
    return str.substring(i + 1, j);
}