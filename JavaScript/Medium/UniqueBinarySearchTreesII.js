/**
 * 95. Unique Binary Search Trees II
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number} n
 * @return {TreeNode[]}
 */
const generateTrees = function(n) {
    if (n === 0)
        return [];

    return helper(1, n);
};

const helper = function (m, n) {
    let result = [];
    if (m > n) {
        result.push(null);
        return result;
    }
    
    for (let i = m; i <= n; i++) {
        let ls = helper(m, i - 1);
        let rs = helper(i + 1, n);
        for (let l of ls) {
            for (let r of rs) {
                let node = new TreeNode(i);
                node.left = l;
                node.right = r;
                result.push(node);
            }
        }
    }
    
    return result;
};