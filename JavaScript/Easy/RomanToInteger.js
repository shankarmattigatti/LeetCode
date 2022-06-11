// 13. Roman to Integer

/**
 * @param {string} symbol
 * @return {number}
 */
var getSymbolValue = function(symbol) {
    if (symbol === 'I')
        return 1;
    if (symbol === 'V')
        return 5;
    if (symbol === 'X')
        return 10;
    if (symbol === 'L')
        return 50;
    if (symbol === 'C')
        return 100;
    if (symbol === 'D')
        return 500;
    if (symbol === 'M')
        return 1000;
    
    return -1;
}

/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    let romanToInt = 0;
    for (let i = 0; i < s.length; i++) {
        let s1 = getSymbolValue(s[i]);
        
        if (i + 1 < s.length) {
            let s2 = getSymbolValue(s[i + 1]);
            if (s1 >= s2) {
                romanToInt += s1;
            } else {
                romanToInt = romanToInt + s2 - s1;
                i++;
            }
        } else {
            romanToInt += s1;
            i++;
        }
    }
    
    return romanToInt; 
};