/**
 * 2551. Put Marbles in Bags
 * @param {number[]} weights
 * @param {number} k
 * @return {number}
 */
const putMarbles = function (weights, k) {
  let len = weights.length - 1;
  let arr = new Array(len), res = 0;
  for (let i = 0; i < len; i++) {
    arr[i] = weights[i] + weights[i + 1];
  }

  arr.sort((a, b) => a - b);
  for (let i = 0; i < k - 1; i++) {
    res += arr[len - 1 - i] - arr[i];
  }
  return res;
};
