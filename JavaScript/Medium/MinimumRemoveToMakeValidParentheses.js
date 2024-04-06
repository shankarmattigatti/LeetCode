/**
 * 1249. Minimum Remove to Make Valid Parentheses
 * @param {string} s
 * @return {string}
 */
const minRemoveToMakeValid = function(s) {
    let stack = [];
    let res = s.split(''); 

    for (let i = 0; i < s.length; i++) {
        if (s.charAt(i) === '(') {
            stack.push(i);
        } else if (s.charAt(i) === ')') {
            if (stack.length > 0)
                stack.pop();
            else 
                res[i] = '*';
        }
    }

    while (stack.length > 0) {
        res[stack.pop()] = '*'; 
    }

    return res.filter(char => char !== '*').join('');
};