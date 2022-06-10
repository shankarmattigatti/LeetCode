// 8. String to Integer (atoi)

/**
 * @param {string} s
 * @return {number}
 */
var myAtoi = function(s) {
    s = s.trim();
    if (s == null || s.length == 0)
        return 0;

    let sum = 0;
    let sign = 1, start = 0, len = s.length;
    if (s[0] == '+') {
        start++;
    } else if (s[0] == '-') {
        sign = -1;
        start++;
    }

    for (let i = start; i < len; i++) {
        if (isNaN(s[i]) || s[i] == ' ')
            return sum * sign;
    
        sum = sum * 10 + parseInt(s[i]);
        
        if (sign == 1 && sum > 2147483647)
            return 2147483647;
        if (sign == -1 && (-1 * sum) < -2147483648)
            return -2147483648;
    }

    return sum * sign;
};