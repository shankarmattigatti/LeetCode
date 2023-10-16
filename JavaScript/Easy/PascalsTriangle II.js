/**
 * 119. Pascal's Triangle II
 * @param {number} rowIndex
 * @return {number[]}
 */
const getRow = function(rowIndex) {
    let res = [];
    if(rowIndex < 0) return res;

    res.push(1);
    for(let i = 1; i <= rowIndex; i++) {
        for(let j = res.length - 2; j >= 0; j--) {
            res[j + 1] = res[j] + res[j + 1];
        }
        res.push(1);
    }

    return res;
};