/**
 * 2614. Prime In Diagonal
 * @param {number[][]} nums
 * @return {number}
 */
var diagonalPrime = function (nums) {
  let largestPrime = 0;
  const n = nums.length;
  for (let i = 0; i < n; i++) {
    if (isPrime(nums[i][i])) {
      largestPrime = Math.max(largestPrime, nums[i][i]);
    }
    if (isPrime(nums[i][n - i - 1])) {
      largestPrime = Math.max(largestPrime, nums[i][n - i - 1]);
    }
  }

  return largestPrime;
};

const isPrime = function (num) {
  if (num < 2) return false;
  for (let i = 2; i <= Math.sqrt(num); i++) {
    if (num % i === 0) return false;
  }
  return true;
};
