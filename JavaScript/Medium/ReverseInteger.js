// 7. Reverse Integer

/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let sign = x < 0 ? -1 : 1;
    let reversed = parseInt(x.toString().split('').reverse().join(''));
    if (reversed >= 2147483647 || reversed <= -2147483648)
        return 0;
        
    return reversed * sign;
};