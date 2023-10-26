/**
 * 823. Binary Trees With Factors
 * @param {number[]} arr
 * @return {number}
 */
const numFactoredBinaryTrees = function (arr) {
  const MOD = 1e9 + 7;
  arr.sort((a, b) => a - b);

  let dp = {};
  for (let i = 0; i < arr.length; i++) {
    dp[arr[i]] = 1;
    for (let j = 0; j < i; j++) {
      if (arr[i] % arr[j] === 0 && dp[arr[i] / arr[j]] !== undefined) {
        dp[arr[i]] = (dp[arr[i]] + dp[arr[j]] * dp[arr[i] / arr[j]]) % MOD;
      }
    }
  }

  let result = 0;
  for (let key in dp) {
    result = (result + dp[key]) % MOD;
  }

  return result;
};