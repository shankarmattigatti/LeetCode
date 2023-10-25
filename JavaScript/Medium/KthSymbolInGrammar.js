/**
 * 779. K-th Symbol in Grammar
 * @param {number} n
 * @param {number} k
 * @return {number}
 */
const kthGrammar = function (n, k) {
  if (n === 1 && k === 1) {
    return 0;
  }
  let mid = Math.pow(2, n - 2);
  if (k <= mid) {
    return kthGrammar(n - 1, k);
  } else {
    return kthGrammar(n - 1, k - mid) === 0 ? 1 : 0;
  }
};